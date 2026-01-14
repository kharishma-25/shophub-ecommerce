package com.shophub.domain.model

data class Order(
    val id: Long,
    val userId: Long,
    val items: List<OrderItem>,
    val totalAmount: Double,
    val status: OrderStatus,
    val shippingAddress: String,
    val paymentMethod: String
)

enum class OrderStatus {
    PENDING, PROCESSING, SHIPPED, DELIVERED, CANCELLED
}

data class OrderItem(
    val id: Long,
    val productId: Long,
    val productName: String,
    val quantity: Int,
    val price: Double
)
