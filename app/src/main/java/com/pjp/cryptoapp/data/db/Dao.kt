package com.pjp.cryptoapp.data.db

import androidx.lifecycle.LiveData
import androidx.room.*
import androidx.room.Dao

@Dao
@TypeConverters
interface Dao {
    @Transaction
    @Query("select * from crypto_table")
    fun getCryptos(): LiveData<List<Crypto>>
}