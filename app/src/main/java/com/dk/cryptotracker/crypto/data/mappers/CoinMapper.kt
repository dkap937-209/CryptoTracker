package com.dk.cryptotracker.crypto.data.mappers

import com.dk.cryptotracker.crypto.data.networking.dto.CoinDto
import com.dk.cryptotracker.crypto.data.networking.dto.CoinPriceDto
import com.dk.cryptotracker.crypto.domain.Coin
import com.dk.cryptotracker.crypto.domain.CoinPrice
import java.time.Instant
import java.time.ZoneId

fun CoinDto.toCoin(): Coin {
    return Coin(
        id = id,
        rank = rank,
        name = name,
        symbol = symbol,
        marketCapUsd = marketCapUsd,
        priceUsd = priceUsd,
        changePercent24Hr = changePercent24Hr
    )
}

fun CoinPriceDto.toCoinPrice(): CoinPrice {
    return CoinPrice(
        priceUsd = priceUsd,
        dateTime = Instant
            .ofEpochSecond(time)
            .atZone(ZoneId.systemDefault())
    )
}