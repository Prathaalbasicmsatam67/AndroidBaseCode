package com.pratham.hiltpoc.network

import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class APIKeyInterceptor @Inject constructor() : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request().newBuilder()
            .addHeader("Authorization", "Bearer YOUR_API_KEY") // Example Header
            .build()

        return chain.proceed(request)
    }
}