package com.mohkhz.flysky_agent.data.Api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\b\b\u0001\u0010\u0015\u001a\u00020\u0016H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00032\b\b\u0001\u0010\u001a\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J+\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00032\b\b\u0001\u0010\u001c\u001a\u00020\u00062\b\b\u0001\u0010\u001d\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ5\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010 \u001a\u00020\u00062\b\b\u0001\u0010\u001c\u001a\u00020\u00062\b\b\u0001\u0010!\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J?\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010$\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u00162\b\b\u0001\u0010\u0015\u001a\u00020\u00162\b\b\u0001\u0010%\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J]\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010(\u001a\u00020\u00062\b\b\u0001\u0010$\u001a\u00020\u00062\b\b\u0001\u0010\u0015\u001a\u00020\u00062\b\b\u0001\u0010)\u001a\u00020\u00062\b\b\u0001\u0010*\u001a\u00020\u00062\b\b\u0001\u0010+\u001a\u00020\u00062\b\b\u0001\u0010%\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010,\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006-"}, d2 = {"Lcom/mohkhz/flysky_agent/data/Api/Api;", "", "closeTicket", "Lretrofit2/Response;", "Lcom/mohkhz/flysky_agent/data/model/Response/AddResponse;", "tId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCategory", "Lcom/mohkhz/flysky_agent/data/model/Response/CategoryListResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMessages", "Lcom/mohkhz/flysky_agent/data/model/Response/MessageListResponse;", "getPriorityCat", "Lcom/mohkhz/flysky_agent/data/model/Response/PriorityCatListResponse;", "getStatusCat", "Lcom/mohkhz/flysky_agent/data/model/Response/StatusCatListResponse;", "getTicket", "Lcom/mohkhz/flysky_agent/data/model/Response/TicketResponse;", "getTickets", "Lcom/mohkhz/flysky_agent/data/model/Response/TicketListResponse;", "uId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUser", "Lcom/mohkhz/flysky_agent/data/model/Response/LoginResponse;", "id", "login", "website", "phoneNumber", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newAgent", "name", "phone", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newMessage", "message", "time", "(Ljava/lang/String;IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newTicket", "title", "priorityCat", "category", "statusCat", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface Api {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "User_login.php")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object login(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "website")
    java.lang.String website, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "phoneNumber")
    java.lang.String phoneNumber, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.mohkhz.flysky_agent.data.model.Response.LoginResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "getUser.php")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object getUser(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.mohkhz.flysky_agent.data.model.Response.LoginResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "getMessage.php")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object getMessages(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "tId")
    java.lang.String tId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.mohkhz.flysky_agent.data.model.Response.MessageListResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "newTicket.php")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object newTicket(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "title")
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "message")
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "uId")
    java.lang.String uId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "priorityCat")
    java.lang.String priorityCat, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "category")
    java.lang.String category, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "statusCat")
    java.lang.String statusCat, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "time")
    java.lang.String time, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.mohkhz.flysky_agent.data.model.Response.AddResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "newMessage.php")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object newMessage(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "text")
    java.lang.String message, @retrofit2.http.Field(value = "tId")
    int tId, @retrofit2.http.Field(value = "uId")
    int uId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "time")
    java.lang.String time, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.mohkhz.flysky_agent.data.model.Response.AddResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "getTicket.php")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object getTickets(@retrofit2.http.Field(value = "uId")
    int uId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.mohkhz.flysky_agent.data.model.Response.TicketListResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "getTicket_byId.php")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object getTicket(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "tId")
    java.lang.String tId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.mohkhz.flysky_agent.data.model.Response.TicketResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "closeTicket.php")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object closeTicket(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "tId")
    java.lang.String tId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.mohkhz.flysky_agent.data.model.Response.AddResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "getPriorityCat.php")
    public abstract java.lang.Object getPriorityCat(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.mohkhz.flysky_agent.data.model.Response.PriorityCatListResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "getStatusCat.php")
    public abstract java.lang.Object getStatusCat(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.mohkhz.flysky_agent.data.model.Response.StatusCatListResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "getCategory.php")
    public abstract java.lang.Object getCategory(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.mohkhz.flysky_agent.data.model.Response.CategoryListResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "newAgent.php")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object newAgent(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "name")
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "website")
    java.lang.String website, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "phone")
    java.lang.String phone, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.mohkhz.flysky_agent.data.model.Response.AddResponse>> continuation);
}