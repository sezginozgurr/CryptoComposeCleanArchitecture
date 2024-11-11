package com.example.cryptocomposecleanarchitecture.data.remote.service

import com.example.cryptocomposecleanarchitecture.data.remote.model.CryptoResponse
import com.example.cryptocomposecleanarchitecture.ui.Constant
import retrofit2.http.GET
import retrofit2.http.Header

interface CryptoService {

    @GET("economy/cripto")
    suspend fun getEconomy(
        @Header("content-type") type: String = Constant.CONTENT_TYPE,
        @Header("authorization") authorization: String = Constant.API_KEY
    ): CryptoResponse

}