export type OrderStatus = 'PENDING' | 'PROCESSING' | 'SHIPPED' | 'DELIVERED' | 'CANCELLED'

export interface OrderItem {
  id: number
  productId: number
  productName: string
  productImageUrl?: string
  quantity: number
  price: number
}

export interface Order {
  id: number
  userId: number
  items: OrderItem[]
  totalAmount: number
  status: OrderStatus
  shippingAddress: string
  paymentMethod: string
  createdAt: string
  updatedAt: string
}
