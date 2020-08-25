package com.example.myapplication

class MarketRepository (
    private val api: BittrexApi
) : SafeApiRequest(){
    suspend fun getMarket() = apiRequest {api.getMarket()}
}
