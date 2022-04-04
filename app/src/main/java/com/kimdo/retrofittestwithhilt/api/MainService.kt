package com.kimdo.retrofittestwithhilt.api

import com.kimdo.retrofittestwithhilt.model.User
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import javax.inject.Singleton


@Singleton
interface MainService {
    @GET("users/{userId}")
    suspend fun getUser(@Path("userId") userId : Int) : Response<User>
}