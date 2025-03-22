package com.pratham.hiltpoc.viewmodels

import androidx.lifecycle.ViewModel
import com.pratham.hiltpoc.MyUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyViewModelWithConstructor @Inject constructor(
    myUseCase: MyUseCase
) : ViewModel() {
}