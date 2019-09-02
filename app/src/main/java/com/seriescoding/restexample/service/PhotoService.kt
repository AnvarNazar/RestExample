package com.seriescoding.restexample.service

import androidx.lifecycle.LiveData
import com.seriescoding.restexample.model.Photo
import com.seriescoding.restexample.util.ApiResponse
import retrofit2.http.*

interface PhotoService {
    @GET("photos")
    fun photos(): LiveData<ApiResponse<List<Photo>>>

    @GET("photos/{id}")
    fun photo(@Path("id") id: Long): LiveData<ApiResponse<List<Photo>>>

    @POST("photos")
    fun postPhoto(@Body photo: Photo): LiveData<ApiResponse<Photo>>

    @PUT("photos")
    fun patchPhoto(@Body photo: Photo): LiveData<ApiResponse<Photo>>

}