package com.dk.cryptotracker.crypto.domain

import com.dk.cryptotracker.core.domain.util.NetworkError
import com.dk.cryptotracker.core.domain.util.Result

interface CoinDataSource {
    suspend fun getCoins(): Result<List<Coin>, NetworkError>
}