package com.pratham.hiltpoc.di

import com.pratham.hiltpoc.MyUseCase
import com.pratham.hiltpoc.viewmodels.MyViewModelWithConstructor
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@InstallIn(ActivityComponent::class)
@Module
object ViewModelModule {

    @Provides
    fun bindUseCase() : MyUseCase {
        return MyUseCase()
    }

    @Provides
    fun bindMyVewModel(myUseCase: MyUseCase) = MyViewModelWithConstructor(myUseCase)

}