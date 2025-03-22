package com.pratham.hiltpoc.di

import com.pratham.hiltpoc.BuildConfig
import com.pratham.hiltpoc.network.APIKeyInterceptor
import com.pratham.networkmodule.BaseUrl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.Interceptor
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @BaseUrl
    @Provides
    @Singleton
    fun provideBaseUrl(): String = BuildConfig.BASE_URL

    @Provides
    @Singleton
    fun provideAPIKeyInterceptor(): List<Interceptor> = listOf(APIKeyInterceptor())

}