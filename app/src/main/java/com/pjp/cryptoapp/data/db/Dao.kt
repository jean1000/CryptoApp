package com.pjp.cryptoapp.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction

@Dao
interface Dao {
    @Transaction
    @Query("select * from crypto_table")
    fun getCryptos(): LiveData<List<Crypto>>
}