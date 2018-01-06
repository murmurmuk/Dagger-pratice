package murmur.daggerpratice

import dagger.Subcomponent
import dagger.android.AndroidInjector
import murmur.daggerpratice.comboInjection.Combo

@Subcomponent(modules = [CakeModule::class])
interface CakeCabinet : AndroidInjector<Combo> {
    @Subcomponent.Builder
    abstract class Builder: AndroidInjector.Builder<Combo>()
}
