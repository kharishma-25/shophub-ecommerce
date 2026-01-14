package com.shophub.data.remote.api

import com.shophub.data.remote.dto.ProductDto
import retrofit2.Response
import retrofit2.http.*

interface ProductApi {
    @GET("products")
    suspend fun getProducts(): Response<ApiResponse<List<ProductDto>>>

    @GET("products/{id}")
    suspend fun getProductById(@Path("id") id: Long): Response<ApiResponse<ProductDto>>
}

data class ApiResponse<T>(
    val success: Boolean,
    val message: String,
    val data: T
)
