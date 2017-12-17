package murmur.daggerpratice

import dagger.Component

@Component
interface CoffeeShop{
    fun order(): Coffee
}