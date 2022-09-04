package com.pjp.cryptoapp.network

import android.content.Context
import com.pjp.cryptoapp.data.db.CryptoDatabase
import com.pjp.cryptoapp.data.repo.CryptoRepoImplementation
import com.pjp.cryptoapp.data.repo.CryptoRepository
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object Network {
    private const val timeOut=20L
    private const val BASE_URL="https://api.coingecko.com/api/v3"

    private val okHttpClient by lazy {
        OkHttpClient.Builder().apply {
            readTimeout(timeOut, TimeUnit.SECONDS)
            connectTimeout(timeOut, TimeUnit.SECONDS)
        }.build()
    }
    private val retrofit=Retrofit.Builder()
        .client(okHttpClient)
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun createRepository(context:Context):CryptoRepository{
        val db = CryptoDatabase.getInstance(context)
        return CryptoRepoImplementation(
            cryptoApi = retrofit.create(CryptoApi::class.java),
            dao = db.cryptoDao(),
            apiMapper = ApiMapper()
        )
    }
}