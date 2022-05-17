package com.mohkhz.covid19_compose.data.repo

import com.mohkhz.flysky_agent.data.model.Messages
import com.mohkhz.flysky_agent.data.model.Response.AddResponse
import com.mohkhz.flysky_agent.data.model.Response.LoginResponse
import com.mohkhz.flysky_agent.data.model.Response.MessageListResponse
import com.mohkhz.flysky_agent.data.model.Response.TicketListResponse
import com.mohkhz.flysky_agent_support.data.model.Ticket
import com.mohkhz.flysky_agent_support.util.Resource
import kotlinx.coroutines.flow.Flow

interface Repository {

    suspend fun login(website: String, phoneNumber: String): Resource<LoginResponse>

    suspend fun getUser(uId: String): Resource<LoginResponse>

    suspend fun updateDataStore(website: String, phoneNumber: String)

    suspend fun readDataStore(): Flow<String>

    suspend fun getMessages(tId: String): Resource<MessageListResponse>

    suspend fun getTickets(uId: Int): Resource<TicketListResponse>

    suspend fun newMessage(messages: Messages): Resource<AddResponse>

    suspend fun newTicket(ticket: Ticket, uId: String, initMessage: String): Resource<AddResponse>

}