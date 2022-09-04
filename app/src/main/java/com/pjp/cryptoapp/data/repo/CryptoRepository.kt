package com.pjp.cryptoapp.data.repo

import androidx.lifecycle.LiveData
import com.pjp.cryptoapp.data.db.Crypto

interface CryptoRepository {
    suspend fun getCryptoPages(page:Int, pageSize:Int):List<Crypto>
    suspend fun getCryptoData():LiveData<List<Crypto>>
}