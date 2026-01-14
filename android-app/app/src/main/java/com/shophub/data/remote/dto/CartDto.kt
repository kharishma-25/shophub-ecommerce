package com.shophub.data.remote.dto

import com.google.gson.annotations.SerializedName

data class CartDto(
    @SerializedName("id") val id: Long,
    @SerializedName("userId") val userId: Long,
    @SerializedName("items") val items: List<CartItemDto>,
    @SerializedName("createdAt") val createdAt: String?,
    @SerializedName("updatedAt") val updatedAt: String?
)
