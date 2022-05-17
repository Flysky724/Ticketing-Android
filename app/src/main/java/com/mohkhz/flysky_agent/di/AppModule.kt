package com.mohkhz.flysky_agent.di

import android.content.Context
import com.mohkhz.covid19_compose.data.repo.Repository
import com.mohkhz.covid19_compose.data.repo.RepositoryImpl
import com.mohkhz.flysky_agent.data.Api.Api
import com.mohkhz.flysky_agent_support.data.model.Ticket
import com.mohkhz.flysky_agent_support.data.model.User
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun providerRepository(
        @ApplicationContext context: Context,
        api: Api,
        user: User,
        ticket: Ticket
    ): Repository {
        return RepositoryImpl(context, user, ticket, api)
    }

    @Singleton
    @Provides
    fun providerApi(): Api =
        Retrofit.Builder().baseUrl("http:/172.16.57.164/pro/flysky_agent/Api/").addConverterFactory(GsonConverterFactory.create()).build()
            .create(Api::class.java)

    @Singleton
    @Provides
    fun providerUser(): User = User()

    @Singleton
    @Provides
    fun provideTicket(): Ticket = Ticket()

}