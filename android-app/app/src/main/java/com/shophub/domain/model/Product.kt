package com.shophub.domain.model

data class Product(
    val id: Long,
    val name: String,
    val description: String?,
    val price: Double,
    val currency: String = "USD", // ISO 4217 currency code (e.g., USD, EUR, GBP)
    val stockQuantity: Int?,
    val imageUrl: String?,
    val category: String?,
    val createdAt: String? = null, // ISO 8601 format date string
    val updatedAt: String? = null  // ISO 8601 format date string
)
