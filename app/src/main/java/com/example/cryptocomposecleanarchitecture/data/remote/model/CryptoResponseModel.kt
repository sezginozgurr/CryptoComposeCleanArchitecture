package com.example.cryptocomposecleanarchitecture.data.remote.model

import com.google.gson.annotations.SerializedName
import java.math.BigDecimal

data class CryptoResponseModel(
    @SerializedName("currency")
    val currency: String? = null,

    @SerializedName("changeWeek")
    val changeWeek: BigDecimal? = null,

    @SerializedName("changeWeekstr")
    val changeWeekstr: String? = null,

    @SerializedName("changeDay")
    val changeDay: BigDecimal? = null,

    @SerializedName("changeDaystr")
    val changeDaystr: String? = null,

    @SerializedName("changeHour")
    val changeHour: BigDecimal? = null,

    @SerializedName("changeHourstr")
    val changeHourstr: String? = null,

    @SerializedName("volumestr")
    val volumeStr: String? = null,

    @SerializedName("volume")
    val volume: Long? = null,

    @SerializedName("pricestr")
    val priceStr: String? = null,

    @SerializedName("price")
    val price: BigDecimal? = null,

    @SerializedName("circulatingSupply")
    val circulatingSupply: String? = null,

    @SerializedName("marketCapstr")
    val marketCapStr: String? = null,

    @SerializedName("marketCap")
    val marketCap: BigDecimal? = null,

    @SerializedName("code")
    val code: String? = null,

    @SerializedName("name")
    val name: String? = null
)
