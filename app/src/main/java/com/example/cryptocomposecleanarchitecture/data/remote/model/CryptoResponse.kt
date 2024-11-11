package com.example.cryptocomposecleanarchitecture.data.remote.model

import com.example.cryptocomposecleanarchitecture.domain.model.CryptoUiModel
import com.example.cryptocomposecleanarchitecture.ui.ignoreNull
import com.example.cryptocomposecleanarchitecture.ui.orZero
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class CryptoResponse(
    @SerializedName("success")
    val success: Boolean = false,

    @SerializedName("result")
    val result: List<CryptoResponseModel> = emptyList()
) : Serializable

fun CryptoResponse.mapTpCrypto(): List<CryptoUiModel> {
    return result.map {
        CryptoUiModel(
            currency = it.currency.orEmpty(),
            changeWeek = it.changeWeek.orZero(),
            changeWeekstr = it.changeWeekstr.orEmpty(),
            changeDay = it.changeDay.orZero(),
            changeDaystr = it.changeDaystr.orEmpty(),
            changeHour = it.changeHour.orZero(),
            changeHourstr = it.changeHourstr.orEmpty(),
            volume = it.volume.ignoreNull(),
            volumeStr = it.volumeStr.orEmpty(),
            price = it.price.orZero(),
            priceStr = it.priceStr.orEmpty(),
            marketCap = it.marketCap.orZero(),
            marketCapStr = it.marketCapStr.orEmpty(),
            code = it.code.orEmpty(),
            name = it.name.orEmpty()
        )
    }
}
