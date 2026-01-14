package com.shophub.data.repository

import com.shophub.data.remote.api.ApiService
import com.shophub.data.remote.api.ProductApi
import com.shophub.data.remote.dto.ProductDto
import com.shophub.domain.model.Product

class ProductRepository {
    private val productApi: ProductApi = ApiService.retrofit.create(ProductApi::class.java)

    suspend fun getProducts(): Result<List<Product>> {
        return try {
            val response = productApi.getProducts()
            if (response.isSuccessful && response.body() != null) {
                val apiResponse = response.body()!!
                if (apiResponse.success && apiResponse.data != null) {
                    Result.success(apiResponse.data.map { it.toProduct() })
                } else {
                    Result.failure(Exception(apiResponse.message ?: "Failed to fetch products"))
                }
            } else {
                Result.failure(Exception("Failed to fetch products: ${response.message()}"))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    private fun ProductDto.toProduct(): Product {
        return Product(
            id = id,
            name = name,
            description = description,
            price = price,
            stockQuantity = stockQuantity,
            imageUrl = imageUrl,
            category = category
        )
    }
}
