package com.kotlinseries.ch5_coroutine

import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET

class RetrofitFactory {
    companion object{
        fun makeRetrofitService(): RetrofitService {
            return Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com")
                .addConverterFactory(ScalarsConverterFactory.create())
                .build().create(RetrofitService::class.java)
        }
    }
}

interface RetrofitService
{
    @GET("/todos/1")
    suspend fun getPosts(): Response<String>
}