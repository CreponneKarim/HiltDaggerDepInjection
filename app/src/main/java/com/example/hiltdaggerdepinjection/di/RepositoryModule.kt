package com.example.hiltdaggerdepinjection.di

import com.example.hiltdaggerdepinjection.data.repository.MyRepositoryImplementation
import com.example.hiltdaggerdepinjection.domain.repository.MyRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindMyRepository(
        myRepositoryImplementation: MyRepositoryImplementation
    ):MyRepository
}