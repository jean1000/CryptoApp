package com.pjp.cryptoapp.data.db

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "crypto_table")
data class Crypto(
    @PrimaryKey
    val symbol: String,
    val price: Double,
    val name: String,
    val image: String,
    val dailyChange: Double,
    val dailyChangePercentage: Double,
    val high: Double,
    val supply: Double?,
    val chartData: List<Float>
):Serializable{
    override fun equals(other: Any?): Boolean {
        return (other as Crypto).symbol==symbol
    }
}
