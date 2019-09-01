package com.seriescoding.restexample.service

import com.seriescoding.restexample.model.Comment
import com.seriescoding.restexample.model.Post
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PostService {
    @GET("posts")
    fun posts(): Call<List<Post>>

    @GET("posts/{id}")
    fun post(@Path("id") id: Long): Post

    @GET("posts/{id}/comments")
    fun postsComments(@Path("id") id: Long): List<Comment>

    @GET("posts")
    fun postsByUser(@Query("userId") userId: Long): List<Post>
}