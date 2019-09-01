package com.seriescoding.restexample.model

import com.google.gson.annotations.SerializedName

data class Comment(
    @field:SerializedName("postId")
    val postId: Long,
    @field:SerializedName("id")
    val id: Long,
    @field:SerializedName("name")
    val name: String,
    @field:SerializedName("email")
    val email: String,
    @field:SerializedName("body")
    val body: String
) {
}