export interface Product {
  id: number
  name: string
  description?: string
  price: number
  stockQuantity?: number
  imageUrl?: string
  category?: string
  createdAt: string
  updatedAt: string
}

export interface ProductRequest {
  name: string
  description?: string
  price: number
  stockQuantity?: number
  imageUrl?: string
  category?: string
}
