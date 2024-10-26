package com.dk.cryptotracker.crypto.presentation.coin_list

import com.dk.cryptotracker.core.domain.util.NetworkError

sealed interface CoinListEvent {
    data class Error(val error: NetworkError) : CoinListEvent
}