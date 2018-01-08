package murmur.daggerpratice.mealInjection

import dagger.Binds
import dagger.MapKey
import dagger.Module
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap
import murmur.daggerpratice.FoodOffer
import kotlin.reflect.KClass

@Module(subcomponents = [FoodOffer::class])
abstract class MealModule {
    @Binds
    @IntoMap
    @MealKey(Meal::class)
    abstract fun bindMealInjectFactory(builder: FoodOffer.Builder)
            : AndroidInjector.Factory<out Meal>
}

@MapKey
annotation class MealKey(val value: KClass<out Meal>)
