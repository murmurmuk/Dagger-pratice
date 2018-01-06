package murmur.daggerpratice

import dagger.Subcomponent
import dagger.android.AndroidInjector
import murmur.daggerpratice.comboInjection.ComboModule

@Subcomponent(modules = [CoffeeModule::class, ComboModule::class])
interface CoffeeShop : AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder: AndroidInjector.Builder<MainActivity>()
}