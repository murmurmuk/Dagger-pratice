package murmur.daggerpratice

import dagger.Subcomponent
import dagger.android.AndroidInjector
import murmur.daggerpratice.mealInjection.Meal

@Subcomponent(modules = [FoodModule::class])
interface FoodOffer : AndroidInjector<Meal> {
    @Subcomponent.Builder
    abstract class Builder: AndroidInjector.Builder<Meal>()
}
