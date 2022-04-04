package com.kimdo.retrofittestwithhilt.api

import javax.inject.Inject

class MainRemoteData @Inject constructor(private val mainService : MainService) {

    suspend fun getUser(userId : Int) = mainService.getUser(userId)
}