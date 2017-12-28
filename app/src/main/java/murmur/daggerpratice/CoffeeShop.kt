package murmur.daggerpratice

import dagger.BindsInstance
import dagger.Component

@Component(modules = [CoffeeModule::class])
interface CoffeeShop {
    fun getCabinet(): CakeCabinet.Builder

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun userName(@UserName userName: String): Builder

        fun build(): CoffeeShop
    }
}