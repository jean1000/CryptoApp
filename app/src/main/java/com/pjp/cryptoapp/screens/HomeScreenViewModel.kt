package com.pjp.cryptoapp.screens

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.paging.Pager
import androidx.paging.PagingConfig
import com.pjp.cryptoapp.data.repo.CryptoRepository
import com.pjp.cryptoapp.network.Network

class HomeScreenViewModel(context: Context):ViewModel() {
    private val cryptoRepository:CryptoRepository=Network.createRepository(context)

    fun getAllCryptos(pageSize:Int=20)= Pager(config = PagingConfig(pageSize = pageSize, initialLoadSize = pageSize)){

    }
}

class HomeScreenViewModelFactory(val context:Context):ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return HomeScreenViewModel(context) as T
    }
}