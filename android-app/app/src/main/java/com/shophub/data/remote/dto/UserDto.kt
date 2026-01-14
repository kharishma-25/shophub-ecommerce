package com.shophub.data.remote.dto

import com.google.gson.annotations.SerializedName

data class UserDto(
    @SerializedName("id") val id: Long,
    @SerializedName("email") val email: String,
    @SerializedName("name") val name: String,
    @SerializedName("phone") val phone: String?,
    @SerializedName("address") val address: String?,
    @SerializedName("role") val role: String, // CUSTOMER, ADMIN
    @SerializedName("createdAt") val createdAt: String?,
    @SerializedName("updatedAt") val updatedAt: String?
)
