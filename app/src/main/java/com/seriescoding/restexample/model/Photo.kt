package com.seriescoding.restexample.model

import com.google.gson.annotations.SerializedName

data class Photo(
    @field:SerializedName("albumId")
    val albumId: Long,
    @field:SerializedName("id")
    val id: Long,
    @field:SerializedName("title")
    val title: String,
    @field:SerializedName("url")
    val url: String,
    @field:SerializedName("thumbnailUrl")
    val thumbnailUrl: String
) {
}