package com.shophub.data.remote.dto

import com.google.gson.annotations.SerializedName

data class CartItemDto(
    @SerializedName("id") val id: Long,
    @SerializedName("productId") val productId: Long,
    @SerializedName("productName") val productName: String,
    @SerializedName("productImageUrl") val productImageUrl: String?,
    @SerializedName("quantity") val quantity: Int,
    @SerializedName("price") val price: Double
)
