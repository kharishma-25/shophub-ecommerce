package com.shophub.domain.model

data class Cart(
    val id: Long,
    val userId: Long,
    val items: List<CartItem>
)

data class CartItem(
    val id: Long,
    val productId: Long,
    val productName: String,
    val productImageUrl: String?,
    val quantity: Int,
    val price: Double
)
