export interface Product {
  id: number
  name: string
  description?: string
  price: number // Note: For production, consider using a decimal library (e.g., decimal.js) or string representation
  currency: string // ISO 4217 currency code (e.g., "USD", "EUR", "GBP")
  stockQuantity?: number
  imageUrl?: string
  category?: string
  createdAt: string // ISO 8601 format date string (e.g., "2024-01-14T10:30:00Z")
  updatedAt: string // ISO 8601 format date string (e.g., "2024-01-14T10:30:00Z")
}

export interface ProductRequest {
  name: string
  description?: string
  price: number // Note: For production, consider using a decimal library (e.g., decimal.js) or string representation
  currency?: string // ISO 4217 currency code (defaults to "USD" if not provided)
  stockQuantity?: number
  imageUrl?: string
  category?: string
}
