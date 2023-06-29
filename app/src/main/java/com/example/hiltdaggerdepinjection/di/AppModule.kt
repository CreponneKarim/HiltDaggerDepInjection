package com.example.hiltdaggerdepinjection.di

import android.app.Application
import com.example.hiltdaggerdepinjection.data.remote.MyApi
import com.example.hiltdaggerdepinjection.data.repository.MyRepositoryImplementation
import com.example.hiltdaggerdepinjection.domain.repository.MyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideMyApi():MyApi{
        return Retrofit
            .Builder()
            .baseUrl("https://test.com")
            .build()
            .create(MyApi::class.java)
    }

/*    @Provides
    @Singleton
    fun provideMyRepository(
        myApi: MyApi,
        app: Application,
        @Named("hello1") hello1: String
    ):MyRepository{
        return MyRepositoryImplementation(myApi,app)
    }*/

    @Provides
    @Singleton
    @Named("hello1")
    fun provideString1() = "hello1"

    @Provides
    @Singleton
    @Named("hello2")
    fun provideString2() = "hello2"
}