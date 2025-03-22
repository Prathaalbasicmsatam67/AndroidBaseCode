package com.pratham.hiltpoc.data

import com.pratham.coroutine_common.api.DispatcherProvider
import com.pratham.hiltpoc.domain.MyRepository
import javax.inject.Inject

class MyRepositoryImpl @Inject constructor(
    localDataSource: LocalDataSource,
    remoteDataSource: RemoteDataSource,
    dispatcherProvider: DispatcherProvider
) : MyRepository {
}