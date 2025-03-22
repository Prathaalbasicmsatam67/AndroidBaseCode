package com.pratham.hiltpoc.di

import com.pratham.hiltpoc.data.MyRepositoryImpl
import com.pratham.hiltpoc.domain.MyRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {

    @Binds
    abstract fun repositoryObject(myRepositoryImpl: MyRepositoryImpl) : MyRepository
}
