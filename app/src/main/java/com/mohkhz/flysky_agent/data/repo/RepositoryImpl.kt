package com.mohkhz.covid19_compose.data.repo

import android.content.Context
import android.util.Log
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import com.mohkhz.flysky_agent.data.Api.Api
import com.mohkhz.flysky_agent.data.model.Messages
import com.mohkhz.flysky_agent.data.model.Response.*
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
            val result = response.body()

            if (result != null) {
                Resource.Success(result)
            } else {
                Resource.Error(response.message())
            }

        } catch (e: Exception) {
            Resource.Error(e.message + " - error ")
        }
    }

    override suspend fun getMessages(tId: String): Resource<MessageListResponse> {
        return try {

            val response = api.getMessages(tId)
            val result = response.body()

            if (result!!.list.size > 0 && result.status_code.equals("1")) { // 1 is ok
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
            val result = response.body()

            if (result!!.status_code == "1") {//&& !result.list.isNullOrEmpty()
                Resource.Success(result)
            } else {
                Log.e(TAG, "${result.message}")
                Resource.Error(result.message + " -- error to get ticket list or is empty")
            }

        } catch (e: Exception) {
            Resource.Error(e.message + " -- error to get ticket list")
        }
    }

    override suspend fun newMessage(messages: Messages): Resource<AddResponse> {
        return try {

            val response = api.newMessage(messages.text, messages.tId, messages.uId, messages.date)
            val result = response.body()

            if (result!!.status_code.equals("1")) {
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
                initMessage,
                uId,
                "${ticket.priority}",
                "${ticket.category}",
                "${ticket.status}",
                "${ticket.createDate}"
            )
            val result = response.body()

            if (result!!.status_code == "1") {
                Resource.Success(result)
            } else {
                Resource.Error(result.message + " -- error to get add new message")
            }

        } catch (e: Exception) {
            Resource.Error(e.message + " -- error to add new message  / exception")
        }
    }

    override suspend fun getPriorityCat(): Resource<PriorityCatListResponse> {
        return try {

            val response = api.getPriorityCat()
            val result = response.body()

            if (result!!.status_code!!.equals(1)) {
                Resource.Success(result)
            } else {
                Resource.Error(result.message + " -- error to get add new message")
            }

        } catch (e: Exception) {
            Log.e(TAG, e.message + " -- error to add new message ")
            Resource.Error(e.message + " -- error to add new message ")
        }
    }

    override suspend fun getStatusCat(): Resource<StatusCatListResponse> {
        return try {

            val response = api.getStatusCat()
            val result = response.body()

            if (result!!.status_code!!.equals(1)) {
                Resource.Success(result)
            } else {
                Resource.Error(result.message + " -- error to get add new message")
            }

        } catch (e: Exception) {
            Log.e(TAG, e.message + " -- error to add new message ")
            Resource.Error(e.message + " -- error to add new message ")
        }
    }

    override suspend fun getCategory(): Resource<CategoryListResponse> {
        return try {

            val response = api.getCategory()
            val result = response.body()

            if (result!!.status_code!!.equals(1)) {
                Resource.Success(result)
            } else {
                Resource.Error(result.message + " -- error to get add new message")
            }

        } catch (e: Exception) {
            Log.e(TAG, e.message + " -- error to add new message ")
            Resource.Error(e.message + " -- error to add new message ")
        }
    }

    override suspend fun getTicket(tId: String): Resource<TicketResponse> {
        return try {
            val response = api.getTicket(tId)
            val result = response.body()

            if (result != null) {
                Resource.Success(result)
            } else {
                Resource.Error(response.message())
            }

        } catch (e: Exception) {
            Resource.Error(e.message + " - error ")
        }
    }

    override suspend fun newAgent(
        name: String,
        website: String,
        phone: String
    ): Resource<AddResponse> {
        return try {

            val result = api.newAgent(name, website, phone)
            val response = result.body()

            if (response!!.status_code == "1") {
                Resource.Success(response)
            } else {
                Resource.Error(response.message + " - add failed")
            }

        } catch (e: Exception) {
            Resource.Error(message = e.message + " - error to add")
        }
    }

    override suspend fun closeTicket(tId: String): Resource<AddResponse> {
        return try {

            val response = api.closeTicket(tId)
            val result = response.body()

            if (result!!.status_code == "1") {
                Resource.Success(result)
            } else {
                Resource.Error(result.message + "error")
            }

        } catch (e: Exception) {
            Resource.Error(e.message + " exception to add")
        }
    }
}