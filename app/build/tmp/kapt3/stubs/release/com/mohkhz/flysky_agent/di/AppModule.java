package com.mohkhz.flysky_agent.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007J*\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004H\u0007J\b\u0010\u000f\u001a\u00020\rH\u0007\u00a8\u0006\u0010"}, d2 = {"Lcom/mohkhz/flysky_agent/di/AppModule;", "", "()V", "provideTicket", "Lcom/mohkhz/flysky_agent_support/data/model/Ticket;", "providerApi", "Lcom/mohkhz/flysky_agent/data/Api/Api;", "providerRepository", "Lcom/mohkhz/covid19_compose/data/repo/Repository;", "context", "Landroid/content/Context;", "api", "user", "Lcom/mohkhz/flysky_agent_support/data/model/User;", "ticket", "providerUser", "app_release"})
@dagger.Module()
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.mohkhz.flysky_agent.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.mohkhz.covid19_compose.data.repo.Repository providerRepository(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.mohkhz.flysky_agent.data.Api.Api api, @org.jetbrains.annotations.NotNull()
    com.mohkhz.flysky_agent_support.data.model.User user, @org.jetbrains.annotations.NotNull()
    com.mohkhz.flysky_agent_support.data.model.Ticket ticket) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.mohkhz.flysky_agent.data.Api.Api providerApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.mohkhz.flysky_agent_support.data.model.User providerUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.mohkhz.flysky_agent_support.data.model.Ticket provideTicket() {
        return null;
    }
}