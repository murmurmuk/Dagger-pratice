package murmur.daggerpratice

import dagger.Subcomponent
import dagger.android.AndroidInjector
import murmur.daggerpratice.comboInjection.Combo
import murmur.daggerpratice.mealInjection.MealModule

@Subcomponent(modules = [CakeModule::class, MealModule::class])
interface CakeCabinet : AndroidInjector<Combo> {
    @Subcomponent.Builder
    abstract class Builder: AndroidInjector.Builder<Combo>()
}
