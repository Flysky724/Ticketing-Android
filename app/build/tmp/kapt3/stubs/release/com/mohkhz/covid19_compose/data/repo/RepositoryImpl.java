package com.mohkhz.covid19_compose.data.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 62\u00020\u0001:\u00016B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\f2\u0006\u0010\u001e\u001a\u00020\u001fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J\u001f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\f2\u0006\u0010\u001e\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\'\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\f2\u0006\u0010$\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J/\u0010\'\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010(\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J\u001f\u0010+\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010,\u001a\u00020-H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.J/\u0010/\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00101J\u0017\u00102\u001a\b\u0012\u0004\u0012\u00020\u000f03H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J!\u00104\u001a\u0002052\u0006\u0010$\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00067"}, d2 = {"Lcom/mohkhz/covid19_compose/data/repo/RepositoryImpl;", "Lcom/mohkhz/covid19_compose/data/repo/Repository;", "context", "Landroid/content/Context;", "user", "Lcom/mohkhz/flysky_agent_support/data/model/User;", "ticket", "Lcom/mohkhz/flysky_agent_support/data/model/Ticket;", "api", "Lcom/mohkhz/flysky_agent/data/Api/Api;", "(Landroid/content/Context;Lcom/mohkhz/flysky_agent_support/data/model/User;Lcom/mohkhz/flysky_agent_support/data/model/Ticket;Lcom/mohkhz/flysky_agent/data/Api/Api;)V", "closeTicket", "Lcom/mohkhz/flysky_agent_support/util/Resource;", "Lcom/mohkhz/flysky_agent/data/model/Response/AddResponse;", "tId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCategory", "Lcom/mohkhz/flysky_agent/data/model/Response/CategoryListResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMessages", "Lcom/mohkhz/flysky_agent/data/model/Response/MessageListResponse;", "getPriorityCat", "Lcom/mohkhz/flysky_agent/data/model/Response/PriorityCatListResponse;", "getStatusCat", "Lcom/mohkhz/flysky_agent/data/model/Response/StatusCatListResponse;", "getTicket", "Lcom/mohkhz/flysky_agent/data/model/Response/TicketResponse;", "getTickets", "Lcom/mohkhz/flysky_agent/data/model/Response/TicketListResponse;", "uId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUser", "Lcom/mohkhz/flysky_agent/data/model/Response/LoginResponse;", "login", "website", "phoneNumber", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newAgent", "name", "phone", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newMessage", "messages", "Lcom/mohkhz/flysky_agent/data/model/Messages;", "(Lcom/mohkhz/flysky_agent/data/model/Messages;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newTicket", "initMessage", "(Lcom/mohkhz/flysky_agent_support/data/model/Ticket;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readDataStore", "Lkotlinx/coroutines/flow/Flow;", "updateDataStore", "", "Companion", "app_release"})
public final class RepositoryImpl implements com.mohkhz.covid19_compose.data.repo.Repository {
    private final android.content.Context context = null;
    private final com.mohkhz.flysky_agent_support.data.model.User user = null;
    private final com.mohkhz.flysky_agent_support.data.model.Ticket ticket = null;
    private final com.mohkhz.flysky_agent.data.Api.Api api = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.mohkhz.covid19_compose.data.repo.RepositoryImpl.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> _website = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> _phoneNumber = null;
    
    @javax.inject.Inject()
    public RepositoryImpl(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.mohkhz.flysky_agent_support.data.model.User user, @org.jetbrains.annotations.NotNull()
    com.mohkhz.flysky_agent_support.data.model.Ticket ticket, @org.jetbrains.annotations.NotNull()
    com.mohkhz.flysky_agent.data.Api.Api api) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object updateDataStore(@org.jetbrains.annotations.NotNull()
    java.lang.String website, @org.jetbrains.annotations.NotNull()
    java.lang.String phoneNumber, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object readDataStore(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<java.lang.String>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object login(@org.jetbrains.annotations.NotNull()
    java.lang.String website, @org.jetbrains.annotations.NotNull()
    java.lang.String phoneNumber, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mohkhz.flysky_agent_support.util.Resource<com.mohkhz.flysky_agent.data.model.Response.LoginResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getUser(@org.jetbrains.annotations.NotNull()
    java.lang.String uId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mohkhz.flysky_agent_support.util.Resource<com.mohkhz.flysky_agent.data.model.Response.LoginResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getMessages(@org.jetbrains.annotations.NotNull()
    java.lang.String tId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mohkhz.flysky_agent_support.util.Resource<com.mohkhz.flysky_agent.data.model.Response.MessageListResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getTickets(int uId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mohkhz.flysky_agent_support.util.Resource<com.mohkhz.flysky_agent.data.model.Response.TicketListResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object newMessage(@org.jetbrains.annotations.NotNull()
    com.mohkhz.flysky_agent.data.model.Messages messages, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mohkhz.flysky_agent_support.util.Resource<com.mohkhz.flysky_agent.data.model.Response.AddResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object newTicket(@org.jetbrains.annotations.NotNull()
    com.mohkhz.flysky_agent_support.data.model.Ticket ticket, @org.jetbrains.annotations.NotNull()
    java.lang.String uId, @org.jetbrains.annotations.NotNull()
    java.lang.String initMessage, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mohkhz.flysky_agent_support.util.Resource<com.mohkhz.flysky_agent.data.model.Response.AddResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getPriorityCat(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mohkhz.flysky_agent_support.util.Resource<com.mohkhz.flysky_agent.data.model.Response.PriorityCatListResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getStatusCat(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mohkhz.flysky_agent_support.util.Resource<com.mohkhz.flysky_agent.data.model.Response.StatusCatListResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getCategory(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mohkhz.flysky_agent_support.util.Resource<com.mohkhz.flysky_agent.data.model.Response.CategoryListResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getTicket(@org.jetbrains.annotations.NotNull()
    java.lang.String tId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mohkhz.flysky_agent_support.util.Resource<com.mohkhz.flysky_agent.data.model.Response.TicketResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object newAgent(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String website, @org.jetbrains.annotations.NotNull()
    java.lang.String phone, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mohkhz.flysky_agent_support.util.Resource<com.mohkhz.flysky_agent.data.model.Response.AddResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object closeTicket(@org.jetbrains.annotations.NotNull()
    java.lang.String tId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mohkhz.flysky_agent_support.util.Resource<com.mohkhz.flysky_agent.data.model.Response.AddResponse>> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007\u00a8\u0006\n"}, d2 = {"Lcom/mohkhz/covid19_compose/data/repo/RepositoryImpl$Companion;", "", "()V", "_phoneNumber", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "get_phoneNumber", "()Landroidx/datastore/preferences/core/Preferences$Key;", "_website", "get_website", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> get_website() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> get_phoneNumber() {
            return null;
        }
    }
}