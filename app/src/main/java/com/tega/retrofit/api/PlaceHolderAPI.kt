package com.tega.retrofit.api

import com.tega.retrofit.models.User
import retrofit2.Call
import retrofit2.http.GET

interface PlaceHolderAPI {

    @GET("users")
    fun  getUsers(): Call<List<User>>
}