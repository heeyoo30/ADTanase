package com.example.atanase.data

import com.example.atanase.data.response.test_responseItem
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.experimental.CoroutineCallAdapterFactory
import kotlinx.coroutines.Deferred
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

//https://jsonplaceholder.typicode.com/posts

interface TestAPI {

@GET("posts")
fun getPosts() {

}

    companion object {
        operator fun invoke(): TestAPI {

            val httpClient = OkHttpClient.Builder()
                .build()

            return Retrofit.Builder()
                .client(httpClient)
                .baseUrl("https://jsonplaceholder.typicode.com/posts")
                .addCallAdapterFactory(CoroutineCallAdapterFactory())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(TestAPI::class.java)
        }

        fun getPosts(): Any {

        }


    }

}