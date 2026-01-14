export type OrderStatus = 'PENDING' | 'PROCESSING' | 'SHIPPED' | 'DELIVERED' | 'CANCELLED'

export interface OrderItem {
  id: number
  productId: number
  productName: string
  productImageUrl?: string
  quantity: number
  price: number // Note: For production, consider using a decimal library (e.g., decimal.js) or string representation
  currency: string // ISO 4217 currency code (e.g., "USD", "EUR", "GBP")
}

export interface Order {
  id: number
  userId: number
  items: OrderItem[]
  totalAmount: number // Note: For production, consider using a decimal library (e.g., decimal.js) or string representation
  currency: string // ISO 4217 currency code (e.g., "USD", "EUR", "GBP")
  status: OrderStatus
  shippingAddress: string
  paymentMethod: string
  createdAt: string // ISO 8601 format date string (e.g., "2024-01-14T10:30:00Z")
  updatedAt: string // ISO 8601 format date string (e.g., "2024-01-14T10:30:00Z")
}
