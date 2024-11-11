package com.example.cryptocomposecleanarchitecture.domain.usecase

import com.example.cryptocomposecleanarchitecture.data.remote.model.mapTpCrypto
import com.example.cryptocomposecleanarchitecture.domain.model.CryptoUiModel
import com.example.cryptocomposecleanarchitecture.domain.repository.CryptoRepository
import com.example.cryptocomposecleanarchitecture.ui.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import okio.IOException
import retrofit2.HttpException
import javax.inject.Inject

class CryptoUseCase @Inject constructor(
    private val cryptoRepository: CryptoRepository
) {

    fun getCrypto(): Flow<Resource<List<CryptoUiModel>>> = flow {
        try {
            emit(Resource.Loading())
            val response = cryptoRepository.getCrypto()
            if (response.success) {
                emit(Resource.Success(response.mapTpCrypto()))
            } else {
                println("sıkıntılı bir durum var")
            }
        } catch (e: HttpException) {
            emit(Resource.Error("Http Exception"))
        } catch (e: IOException) {
            emit(Resource.Error("IO Exception"))
        }
    }

}