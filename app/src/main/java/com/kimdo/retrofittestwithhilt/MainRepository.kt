package com.kimdo.retrofittestwithhilt

import com.kimdo.retrofittestwithhilt.api.MainRemoteData
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class MainRepository @Inject constructor(
    private val remoteData: MainRemoteData
) {
    suspend fun getUser(userId : Int) = remoteData.getUser(userId)
}
