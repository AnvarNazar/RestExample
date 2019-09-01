package com.seriescoding.restexample.model

import com.google.gson.annotations.SerializedName

data class User(
    @field:SerializedName("id")
    val id: Long,
    @field:SerializedName("name")
    val name: String,
    @field:SerializedName("username")
    val username: String,
    @field:SerializedName("email")
    val email: String,
    @field:SerializedName("address")
    val address: Address,
    @field:SerializedName("phone")
    val phone: String,
    @field:SerializedName("website")
    val website: String,
    @field:SerializedName("company")
    val company: Company
) {

    data class Address(
        @field:SerializedName("street")
        val street: String,
        @field:SerializedName("suite")
        val suite: String,
        @field:SerializedName("city")
        val city: String,
        @field:SerializedName("zipcode")
        val zipcode: String,
        @field:SerializedName("geo")
        val geo: Geo
    ) {
        data class Geo(
            @field:SerializedName("lat")
            val lat: Double,
            @field:SerializedName("lng")
            val lng: Double
        )
    }

    data class Company(
        @field:SerializedName("name")
        val name: String,
        @field:SerializedName("catchPhrase")
        val catchPhrase: String,
        @field:SerializedName("bs")
        val bs: String
    )
}