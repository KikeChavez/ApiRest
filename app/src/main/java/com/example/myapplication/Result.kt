package com.example.myapplication

data class Result(
    val BaseCurrency: String,
    val BaseCurrencyLong: String,
    val Created: String,
    val IsActive: Boolean,
    val IsRestricted: Boolean,
    val IsSponsored: Boolean,
    val LogoUrl: String,
    val MarketCurrency: String,
    val MarketCurrencyLong: String,
    val MarketName: String,
    val MinTradeSize: Double,
    val Notice: String
)