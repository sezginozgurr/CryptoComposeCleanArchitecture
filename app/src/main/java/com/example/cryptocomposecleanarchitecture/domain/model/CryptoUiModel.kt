package com.example.cryptocomposecleanarchitecture.domain.model

import com.example.cryptocomposecleanarchitecture.ui.empty
import java.math.BigDecimal

data class CryptoUiModel(
    val currency: String = String.empty(),
    val changeWeek: BigDecimal = BigDecimal.ONE,
    val changeWeekstr: String = String.empty(),
    val changeDay: BigDecimal = BigDecimal.ONE,
    val changeDaystr: String = String.empty(),
    val changeHour: BigDecimal = BigDecimal.ONE,
    val changeHourstr: String = String.empty(),
    val volumeStr: String = String.empty(),
    val volume: Long = -1,
    val priceStr: String = String.empty(),
    val price: BigDecimal = BigDecimal.ONE,
    val circulatingSupply: String = String.empty(),
    val marketCapStr: String = String.empty(),
    val marketCap: BigDecimal = BigDecimal.ONE,
    val code: String = String.empty(),
    val name: String = String.empty()
)
