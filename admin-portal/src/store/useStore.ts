import { create } from 'zustand'
import { User } from '@/types/user'

interface StoreState {
  user: User | null
  setUser: (user: User) => void
  clearUser: () => void
}

export const useStore = create<StoreState>((set) => ({
  user: null,
  setUser: (user) => set({ user }),
  clearUser: () => set({ user: null }),
}))
