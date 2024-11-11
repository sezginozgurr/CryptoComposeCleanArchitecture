package com.example.cryptocomposecleanarchitecture.ui

import java.math.BigDecimal

fun String.Companion.empty(): String {
    return ""
}

fun Double?.orZero(): Double {
    return this ?: 0.0
}

fun BigDecimal?.orZero(): BigDecimal {
    return this ?: BigDecimal.ZERO
}

fun Long?.ignoreNull(): Long {
    return this ?: -1L
}