package com.mohkhz.covid19_compose.data.repo

import com.mohkhz.flysky_agent.data.model.Messages
import com.mohkhz.flysky_agent.data.model.Response.*
import com.mohkhz.flysky_agent_support.data.model.Ticket
import com.mohkhz.flysky_agent_support.util.Resource
import kotlinx.coroutines.flow.Flow

interface Repository {

    suspend fun login(website: String, phoneNumber: String): Resource<LoginResponse>

    suspend fun getUser(uId: String): Resource<LoginResponse>

    suspend fun newAgent(name: String, website: String, phone: String): Resource<AddResponse>

    suspend fun updateDataStore(website: String, phoneNumber: String)

    suspend fun readDataStore(): Flow<String>

    suspend fun getMessages(tId: String): Resource<MessageListResponse>

    suspend fun getTickets(uId: Int): Resource<TicketListResponse>

    suspend fun getTicket(tId: String): Resource<TicketResponse>

    suspend fun closeTicket(tId: String): Resource<AddResponse>

    suspend fun newMessage(messages: Messages): Resource<AddResponse>

    suspend fun newTicket(ticket: Ticket, uId: String, initMessage: String): Resource<AddResponse>

    suspend fun getPriorityCat(): Resource<PriorityCatListResponse>

    suspend fun getStatusCat(): Resource<StatusCatListResponse>

    suspend fun getCategory(): Resource<CategoryListResponse>

}