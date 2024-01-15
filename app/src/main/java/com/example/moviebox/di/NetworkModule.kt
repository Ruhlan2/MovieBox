package com.example.moviebox.di

import android.content.Context
import com.example.moviebox.common.util.Constants
import com.example.moviebox.data.repository.ApiRepositoryImpl
import com.example.moviebox.data.service.ApiKeyInterceptor
import com.example.moviebox.data.service.Service
import com.example.moviebox.data.source.ApiSource
import com.example.moviebox.data.source.ApiSourceImpl
import com.example.moviebox.domain.repository.ApiRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun injectInterceptors()= ApiKeyInterceptor()

    @Singleton
    @Provides
    fun injectOkHttp3(interceptor: ApiKeyInterceptor, @ApplicationContext context:Context)=
        OkHttpClient.Builder().addInterceptor(interceptor).build()

    @Singleton
    @Provides
    fun injectRetrofit(okHttpClient: OkHttpClient)=
        Retrofit.Builder().client(okHttpClient).addConverterFactory(GsonConverterFactory.create()).baseUrl(Constants.BASE_URL).build()

    @Singleton
    @Provides
    fun injectService(retrofit: Retrofit)=retrofit.create(Service::class.java)

    @Singleton
    @Provides
    fun injectSource(service: Service)=ApiSourceImpl(service) as ApiSource

    @Singleton
    @Provides
    fun injectRepo(source:ApiSource)=ApiRepositoryImpl(source) as ApiRepository
}