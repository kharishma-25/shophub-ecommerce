package com.shophub.data.remote.dto

import com.google.gson.annotations.SerializedName

data class OrderDto(
    @SerializedName("id") val id: Long,
    @SerializedName("userId") val userId: Long,
    @SerializedName("items") val items: List<OrderItemDto>,
    @SerializedName("totalAmount") val totalAmount: Double,
    @SerializedName("status") val status: String, // PENDING, PROCESSING, SHIPPED, DELIVERED, CANCELLED
    @SerializedName("shippingAddress") val shippingAddress: String,
    @SerializedName("paymentMethod") val paymentMethod: String,
    @SerializedName("createdAt") val createdAt: String?,
    @SerializedName("updatedAt") val updatedAt: String?
)
