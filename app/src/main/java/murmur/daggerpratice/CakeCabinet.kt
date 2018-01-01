package murmur.daggerpratice

import dagger.Component

@Component(dependencies = [CoffeeShop::class], modules = [CakeModule::class])
interface CakeCabinet {
    fun order(combo: Combo)
}
