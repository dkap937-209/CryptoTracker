package com.dk.cryptotracker.core.presentation.util

import android.content.Context
import android.net.Network
import com.dk.cryptotracker.R
import com.dk.cryptotracker.core.domain.util.NetworkError

fun NetworkError.toString(context: Context): String {
    val resId =  when (this) {
        NetworkError.REQUEST_TIMEOUT -> R.string.error_request_timeout
        NetworkError.TOO_MANY_REQUESTS -> R.string.error_too_many_request
        NetworkError.NO_INTERNET -> R.string.error_no_internet
        NetworkError.SERVER_ERROR -> R.string.error_unknown
        NetworkError.SERIALIZATION -> R.string.error_serialization
        NetworkError.UNKNOWN -> R.string.error_unknown
    }

    return context.getString(resId)
}