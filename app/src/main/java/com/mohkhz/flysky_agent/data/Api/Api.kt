package com.mohkhz.flysky_agent.data.Api

import com.mohkhz.flysky_agent.data.model.Response.*
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
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
    ): Response<LoginResponse>

    @FormUrlEncoded
    @POST("getMessage.php")
    suspend fun getMessages(
        @Field("tId") tId: String
    ): Response<MessageListResponse>

    @FormUrlEncoded
    @POST("newTicket.php")
    suspend fun newTicket(
        @Field("title") title: String,
        @Field("message") message: String,
        @Field("uId") uId: String,
        @Field("priorityCat") priorityCat: String,
        @Field("category") category: String,
        @Field("statusCat") statusCat: String,
        @Field("time") time: String,
    ): Response<AddResponse>

    @FormUrlEncoded
    @POST("newMessage.php")
    suspend fun newMessage(
        @Field("text") message: String,
        @Field("tId") tId: Int,
        @Field("uId") uId: Int,
        @Field("time") time: String,
    ): Response<AddResponse>

    @FormUrlEncoded
    @POST("getTicket.php")
    suspend fun getTickets(
        @Field("uId") uId: Int
    ): Response<TicketListResponse>

    @FormUrlEncoded
    @POST("getTicket_byId.php")
    suspend fun getTicket(
        @Field("tId") tId: String
    ): Response<TicketResponse>

    @FormUrlEncoded
    @POST("closeTicket.php")
    suspend fun closeTicket(
        @Field("tId") tId: String
    ): Response<AddResponse>

    @GET("getPriorityCat.php")
    suspend fun getPriorityCat(): Response<PriorityCatListResponse>

    @GET("getStatusCat.php")
    suspend fun getStatusCat(): Response<StatusCatListResponse>

    @GET("getCategory.php")
    suspend fun getCategory(): Response<CategoryListResponse>

    @FormUrlEncoded
    @POST("newAgent.php")
    suspend fun newAgent(
        @Field("name") name: String,
        @Field("website") website: String,
        @Field("phone") phone: String,
    ): Response<AddResponse>

}