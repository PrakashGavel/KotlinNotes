package com.example.kotlinnotes.di

import android.app.Application
import com.example.kotlinnotes.data.remote.MyApi
import com.example.kotlinnotes.data.repository.MyRepositoryImpl
import com.example.kotlinnotes.domain.repository.MyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton
import javax.inject.Named


@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton  // Difference between SingletonComponent and Singleton scope: SingletonComponent is the Hilt component that lives as long as the application, while Singleton scope ensures that the provided instance is a singleton within that component.
    fun provideMyApi(): MyApi{
        return Retrofit.Builder()
            .baseUrl("https://example.com/")
            .build()
            .create(MyApi::class.java)
    }

    @Provides
    @Singleton
    fun provideMyRepository(
        api: MyApi,
        app: Application,
        @Named("hello1") hello1: String
    ): MyRepository {
        return MyRepositoryImpl(api, app)
    }

    @Provides
    @Singleton
    @Named("hello1")
    fun provideString1() = "Hello 1"

    @Provides
    @Singleton
    @Named("hello2")
    fun provideString2() = "Hello 2"
}