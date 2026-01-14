export type UserRole = 'CUSTOMER' | 'ADMIN'

export interface User {
  id: number
  email: string
  name: string
  phone?: string
  address?: string
  role: UserRole
  createdAt: string
  updatedAt: string
}
