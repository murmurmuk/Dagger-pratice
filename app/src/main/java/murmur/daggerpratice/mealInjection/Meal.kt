package murmur.daggerpratice.mealInjection

import android.util.Log
import murmur.daggerpratice.Cake
import murmur.daggerpratice.Coffee
import murmur.daggerpratice.Food
import murmur.daggerpratice.genericInjector.GenericInjection
import murmur.daggerpratice.genericInjector.HasInjector
import javax.inject.Inject

class Meal(hasInjector: HasInjector<Meal>) {
    init {
        GenericInjection.inject(this, hasInjector, Meal::class.java.name)
    }
    @Inject
    lateinit var coffee: Coffee

    @Inject
    lateinit var cake: Cake

    @Inject
    lateinit var food: Food

    fun show() {
        Log.d("kanna", "There are a ${food.name}, a ${cake.name} and a ${coffee.name} in the meal.")
    }
}