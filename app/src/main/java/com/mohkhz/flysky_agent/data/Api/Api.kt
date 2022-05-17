package com.mohkhz.flysky_agent.data.Api

import com.mohkhz.flysky_agent.data.model.Response.AddResponse
import com.mohkhz.flysky_agent.data.model.Response.LoginResponse
import com.mohkhz.flysky_agent.data.model.Response.MessageListResponse
import com.mohkhz.flysky_agent.data.model.Response.TicketListResponse
import com.mohkhz.flysky_agent_support.util.Resource
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface Api {

    @FormUrlEncoded
    @POST("User_login.php")
    suspend fun login(
        @Field("website") website: String,
        @Field("phoneNumber") phoneNumber: String,
    ): Response<LoginResponse>

    @FormUrlEncoded
    @POST("getUser.php")
    suspend fun getUser(
        @Field("id") id: String
    ): Resource<LoginResponse>

    @FormUrlEncoded
    @POST("getMessage.php")
    suspend fun getMessages(
        @Field("tId") tId: String
    ): Resource<MessageListResponse>

    @FormUrlEncoded
    @POST("newTicket.php")
    suspend fun newTicket(
        @Field("title") title: String,
        @Field("message") message: String,
        @Field("uId") uId: String,
        @Field("priorityCat") priorityCat: String,
        @Field("category") category: String,
        @Field("statusCat") statusCat: String,
    ): Resource<AddResponse>

    @FormUrlEncoded
    @POST("newMessage.php")
    suspend fun newMessage(
        @Field("text") message: String,
        @Field("tId") tId: Int,
        @Field("uId") uId: Int,
    ): Resource<AddResponse>

    @FormUrlEncoded
    @POST("getTicket.php")
    suspend fun getTickets(
        @Field("uId") uId: Int
    ): Resource<TicketListResponse>

}