package com.shophub.domain.model

data class Order(
    val id: Long,
    val userId: Long,
    val items: List<OrderItem>,
    val totalAmount: Double,
    val currency: String = "USD", // ISO 4217 currency code (e.g., USD, EUR, GBP)
    val status: OrderStatus,
    val shippingAddress: String,
    val paymentMethod: String,
    val createdAt: String? = null, // ISO 8601 format date string
    val updatedAt: String? = null  // ISO 8601 format date string
)

enum class OrderStatus {
    PENDING, PROCESSING, SHIPPED, DELIVERED, CANCELLED
}

data class OrderItem(
    val id: Long,
    val productId: Long,
    val productName: String,
    val quantity: Int,
    val price: Double,
    val currency: String = "USD" // ISO 4217 currency code (e.g., USD, EUR, GBP)
)
