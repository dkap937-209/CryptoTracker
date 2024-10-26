package com.dk.cryptotracker.di

import com.dk.cryptotracker.core.data.networking.HttpClientFactory
import com.dk.cryptotracker.crypto.data.networking.RemoteCoinDataSource
import com.dk.cryptotracker.crypto.domain.CoinDataSource
import com.dk.cryptotracker.crypto.presentation.coin_list.CoinListViewModel
import io.ktor.client.engine.cio.CIO
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val appModule = module {
    single { HttpClientFactory.create(CIO.create()) }
    singleOf(::RemoteCoinDataSource).bind<CoinDataSource>()

    viewModel { CoinListViewModel(get()) }
}