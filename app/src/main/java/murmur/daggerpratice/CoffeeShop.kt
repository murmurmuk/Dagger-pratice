package murmur.daggerpratice

import dagger.Subcomponent
import dagger.android.AndroidInjector

@Subcomponent(modules = [CoffeeModule::class])
interface CoffeeShop : AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder: AndroidInjector.Builder<MainActivity>()
}