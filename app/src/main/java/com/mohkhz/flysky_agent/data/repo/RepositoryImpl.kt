package com.mohkhz.covid19_compose.data.repo

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import com.mohkhz.flysky_agent.data.Api.Api
import com.mohkhz.flysky_agent.data.model.Messages
import com.mohkhz.flysky_agent.data.model.Response.AddResponse
import com.mohkhz.flysky_agent.data.model.Response.LoginResponse
import com.mohkhz.flysky_agent.data.model.Response.MessageListResponse
import com.mohkhz.flysky_agent.data.model.Response.TicketListResponse
import com.mohkhz.flysky_agent_support.data.model.Ticket
import com.mohkhz.flysky_agent_support.data.model.User
import com.mohkhz.flysky_agent_support.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

const val DataStoreName = "Login_data"
val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = DataStoreName)
private const val TAG = "RepositoryImpl"

class RepositoryImpl @Inject constructor(
    private val context: Context,
    private val user: User,
    private val ticket: Ticket,
    private val api: Api,
) : Repository {

    companion object {
        val _website = stringPreferencesKey("website")
        val _phoneNumber = stringPreferencesKey("phoneNumber")
    }

    override suspend fun updateDataStore(website: String, phoneNumber: String) {
        context.dataStore.edit { data ->
            data[_website] = website.toString()
            data[_phoneNumber] = phoneNumber.toString()
        }
    }

    override suspend fun readDataStore(): Flow<String> {
        return context.dataStore.data.map { test ->
            "${test[_website].toString()}:${test[_phoneNumber].toString()}"
        }
    }

    override suspend fun login(website: String, phoneNumber: String): Resource<LoginResponse> {
        return try {

            val response = api.login(website, phoneNumber)
            val result = response.body()

            if (response.isSuccessful && result != null) {
                Resource.Success(result)
            } else {
                Resource.Error(response.message())
            }

        } catch (e: Exception) {
            Resource.Error(e.message + " - error ")
        }
    }

    override suspend fun getUser(uId: String): Resource<LoginResponse> {
        return try {
            val response = api.getUser(uId)
            val result = response.data

            if (result != null) {
                Resource.Success(result)
            } else {
                Resource.Error(response.message!!)
            }

        } catch (e: Exception) {
            Resource.Error(e.message + " - error ")
        }
    }

    override suspend fun getMessages(tId: String): Resource<MessageListResponse> {
        return try {

            val response = api.getMessages(tId)
            val result = response.data

            if (result!!.list.size > 0 && result.status_code.equals(1)) { // 1 is ok
                Resource.Success(result)
            } else {
                Resource.Error(result.message + " -- error to get the ticket message or is empty")
            }

        } catch (e: Exception) {
            Resource.Error(e.message + "error to get the ticket message")
        }
    }

    override suspend fun getTickets(uId: Int): Resource<TicketListResponse> {
        return try {
            val response = api.getTickets(uId)
            val result = response.data

            if (result!!.status_code.equals(1) && !result.list.isNullOrEmpty()) {
                Resource.Success(result)
            } else {
                Resource.Error(result.message + " -- error to get ticket list or is empty")
            }

        } catch (e: Exception) {
            Resource.Error(e.message + " -- error to get ticket list")
        }
    }

    override suspend fun newMessage(messages: Messages): Resource<AddResponse> {
        return try {

            val response = api.newMessage(messages.text, messages.tId, messages.uId)
            val result = response.data

            if (result!!.status_code.equals(1)) {
                Resource.Success(result)
            } else {
                Resource.Error(result.message + " -- error to get add new message")
            }

        } catch (e: Exception) {
            Resource.Error(e.message + " -- error to add new message ")
        }
    }

    override suspend fun newTicket(
        ticket: Ticket,
        uId: String,
        initMessage: String
    ): Resource<AddResponse> {
        return try {

            val response = api.newTicket(
                "${ticket.title}",
                "",
                uId,
                "${ticket.PCategory}",
                "${ticket.TCategory}",
                "${ticket.SCategory}"
            )
            val result = response.data

            if (result!!.status_code.equals(1)) {
                Resource.Success(result)
            } else {
                Resource.Error(result.message + " -- error to get add new message")
            }

        } catch (e: Exception) {
            Resource.Error(e.message + " -- error to add new message ")
        }
    }
}