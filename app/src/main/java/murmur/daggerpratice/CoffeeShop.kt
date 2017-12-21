package murmur.daggerpratice

import dagger.Component

@Component(modules = [CoffeeModule::class])
interface CoffeeShop {
    fun order(activity: MainActivity)
}