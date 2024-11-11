package com.example.cryptocomposecleanarchitecture.data.repository

import com.example.cryptocomposecleanarchitecture.data.remote.model.CryptoResponse
import com.example.cryptocomposecleanarchitecture.data.remote.service.CryptoService
import com.example.cryptocomposecleanarchitecture.domain.repository.CryptoRepository
import javax.inject.Inject

class CryptoRepositoryImpl @Inject constructor(
    private val service: CryptoService
) : CryptoRepository {

    override suspend fun getCrypto(): CryptoResponse {
        return service.getEconomy()
    }

}