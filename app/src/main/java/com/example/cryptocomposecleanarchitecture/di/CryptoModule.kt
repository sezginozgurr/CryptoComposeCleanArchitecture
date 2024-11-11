package com.example.cryptocomposecleanarchitecture.di

import com.example.cryptocomposecleanarchitecture.data.remote.service.CryptoService
import com.example.cryptocomposecleanarchitecture.data.repository.CryptoRepositoryImpl
import com.example.cryptocomposecleanarchitecture.domain.repository.CryptoRepository
import com.example.cryptocomposecleanarchitecture.ui.Constant.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object CryptoModule {

    @Singleton
    @Provides
    fun provideApi(): CryptoService {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CryptoService::class.java)
    }

    @Singleton
    @Provides
    fun provideRepository(cyrService: CryptoService): CryptoRepository =
        CryptoRepositoryImpl(cyrService)

}