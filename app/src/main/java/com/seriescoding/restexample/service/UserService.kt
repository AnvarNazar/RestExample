package com.seriescoding.restexample.service

import com.seriescoding.restexample.model.User
import retrofit2.Call
import retrofit2.http.GET

interface UserService {
    @GET("users")
    fun users(): Call<List<User>>
}