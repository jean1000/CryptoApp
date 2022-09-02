package com.pjp.cryptoapp.network

data class CryptoApiResponse(
    val id:String,
    val symbol:String,
    val name:String,
    val imag:String,
    val current_price:Double,
    val market_cap:Long,
    val total_volume:Double,
    val high_24h:Double,
    val low_24h:Double,
    val price_change_24h:Double,
    val price_change_percentage_24h:Double,
    val total_supply:Double,
    val sparkline_in_7d:LineData
)

data class LineData (
    val price:List<Float>
)