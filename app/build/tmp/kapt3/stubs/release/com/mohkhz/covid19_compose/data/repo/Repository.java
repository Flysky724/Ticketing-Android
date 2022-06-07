package com.mohkhz.covid19_compose.data.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\u0006\u0010\u0015\u001a\u00020\u0016H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00032\u0006\u0010\u0015\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\'\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00032\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ/\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u001f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010#\u001a\u00020$H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%J/\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\'\u001a\u00020(2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060,H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ!\u0010-\u001a\u00020.2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006/"}, d2 = {"Lcom/mohkhz/covid19_compose/data/repo/Repository;", "", "closeTicket", "Lcom/mohkhz/flysky_agent_support/util/Resource;", "Lcom/mohkhz/flysky_agent/data/model/Response/AddResponse;", "tId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCategory", "Lcom/mohkhz/flysky_agent/data/model/Response/CategoryListResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMessages", "Lcom/mohkhz/flysky_agent/data/model/Response/MessageListResponse;", "getPriorityCat", "Lcom/mohkhz/flysky_agent/data/model/Response/PriorityCatListResponse;", "getStatusCat", "Lcom/mohkhz/flysky_agent/data/model/Response/StatusCatListResponse;", "getTicket", "Lcom/mohkhz/flysky_agent/data/model/Response/TicketResponse;", "getTickets", "Lcom/mohkhz/flysky_agent/data/model/Response/TicketListResponse;", "uId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUser", "Lcom/mohkhz/flysky_agent/data/model/Response/LoginResponse;", "login", "website", "phoneNumber", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newAgent", "name", "phone", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newMessage", "messages", "Lcom/mohkhz/flysky_agent/data/model/Messages;", "(Lcom/mohkhz/flysky_agent/data/model/Messages;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newTicket", "ticket", "Lcom/mohkhz/flysky_agent_support/data/model/Ticket;", "initMessage", "(Lcom/mohkhz/flysky_agent_support/data/model/Ticket;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readDataStore", "Lkotlinx/coroutines/flow/Flow;", "updateDataStore", "", "app_release"})
public abstract interface Repository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object login(@org.jetbrains.annotations.NotNull()
    java.lang.String website, @org.jetbrains.annotations.NotNull()
    java.lang.String phoneNumber, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mohkhz.flysky_agent_support.util.Resource<com.mohkhz.flysky_agent.data.model.Response.LoginResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUser(@org.jetbrains.annotations.NotNull()
    java.lang.String uId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mohkhz.flysky_agent_support.util.Resource<com.mohkhz.flysky_agent.data.model.Response.LoginResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object newAgent(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String website, @org.jetbrains.annotations.NotNull()
    java.lang.String phone, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mohkhz.flysky_agent_support.util.Resource<com.mohkhz.flysky_agent.data.model.Response.AddResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateDataStore(@org.jetbrains.annotations.NotNull()
    java.lang.String website, @org.jetbrains.annotations.NotNull()
    java.lang.String phoneNumber, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object readDataStore(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<java.lang.String>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getMessages(@org.jetbrains.annotations.NotNull()
    java.lang.String tId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mohkhz.flysky_agent_support.util.Resource<com.mohkhz.flysky_agent.data.model.Response.MessageListResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTickets(int uId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mohkhz.flysky_agent_support.util.Resource<com.mohkhz.flysky_agent.data.model.Response.TicketListResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTicket(@org.jetbrains.annotations.NotNull()
    java.lang.String tId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mohkhz.flysky_agent_support.util.Resource<com.mohkhz.flysky_agent.data.model.Response.TicketResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object closeTicket(@org.jetbrains.annotations.NotNull()
    java.lang.String tId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mohkhz.flysky_agent_support.util.Resource<com.mohkhz.flysky_agent.data.model.Response.AddResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object newMessage(@org.jetbrains.annotations.NotNull()
    com.mohkhz.flysky_agent.data.model.Messages messages, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mohkhz.flysky_agent_support.util.Resource<com.mohkhz.flysky_agent.data.model.Response.AddResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object newTicket(@org.jetbrains.annotations.NotNull()
    com.mohkhz.flysky_agent_support.data.model.Ticket ticket, @org.jetbrains.annotations.NotNull()
    java.lang.String uId, @org.jetbrains.annotations.NotNull()
    java.lang.String initMessage, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mohkhz.flysky_agent_support.util.Resource<com.mohkhz.flysky_agent.data.model.Response.AddResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPriorityCat(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mohkhz.flysky_agent_support.util.Resource<com.mohkhz.flysky_agent.data.model.Response.PriorityCatListResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getStatusCat(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mohkhz.flysky_agent_support.util.Resource<com.mohkhz.flysky_agent.data.model.Response.StatusCatListResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCategory(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mohkhz.flysky_agent_support.util.Resource<com.mohkhz.flysky_agent.data.model.Response.CategoryListResponse>> continuation);
}