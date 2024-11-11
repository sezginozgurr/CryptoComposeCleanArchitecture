package com.example.cryptocomposecleanarchitecture.domain.repository

import com.example.cryptocomposecleanarchitecture.data.remote.model.CryptoResponse

interface CryptoRepository {

    suspend fun getCrypto(): CryptoResponse
}