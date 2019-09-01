package com.seriescoding.restexample.service

import com.seriescoding.restexample.model.Photo
import retrofit2.http.*

interface PhotoService {
    @GET("photos")
    fun photos(): List<Photo>

    @GET("photos/{id}")
    fun photo(@Path("id") id: Long): List<Photo>

    @POST("photos")
    fun postPhoto(@Body photo: Photo): List<Photo>

    @PUT("photos")
    fun patchPhoto(@Body photo: Photo): List<Photo>

}