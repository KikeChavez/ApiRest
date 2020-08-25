package com.example.myapplication

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.Response

interface BittrexApi {

    @GET("getmarkets")
    suspend fun getMarket() :  Response<List<BittrexResponse>>

    companion object{
        operator fun invoke() : BittrexApi{
            return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://api.bittrex.com/api/v1.1/public/")
                .build()
                .create(BittrexApi::class.java)
        }
    }
}
