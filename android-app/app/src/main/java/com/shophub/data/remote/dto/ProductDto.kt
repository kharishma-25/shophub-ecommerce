package com.shophub.data.remote.dto

import com.google.gson.annotations.SerializedName

data class ProductDto(
    @SerializedName("id") val id: Long,
    @SerializedName("name") val name: String,
    @SerializedName("description") val description: String?,
    @SerializedName("price") val price: Double,
    @SerializedName("stockQuantity") val stockQuantity: Int?,
    @SerializedName("imageUrl") val imageUrl: String?,
    @SerializedName("category") val category: String?
)
