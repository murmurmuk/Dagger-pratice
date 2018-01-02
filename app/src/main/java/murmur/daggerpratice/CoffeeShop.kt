package murmur.daggerpratice

import dagger.Component

@Component(modules = [CoffeeModule::class])
interface CoffeeShop {
    @Hot
    fun getHotCoffee(): Coffee

    @Ice
    fun getIceCoffee(): Coffee
}