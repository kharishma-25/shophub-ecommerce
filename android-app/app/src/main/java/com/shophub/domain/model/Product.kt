package com.shophub.domain.model

data class Product(
    val id: Long,
    val name: String,
    val description: String?,
    val price: Double,
    val stockQuantity: Int?,
    val imageUrl: String?,
    val category: String?
)
