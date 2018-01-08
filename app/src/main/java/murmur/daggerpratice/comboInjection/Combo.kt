package murmur.daggerpratice.comboInjection

import android.util.Log
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import murmur.daggerpratice.Cake
import murmur.daggerpratice.Coffee
import murmur.daggerpratice.genericInjector.GenericInjection
import murmur.daggerpratice.genericInjector.HasInjector
import murmur.daggerpratice.mealInjection.Meal
import javax.inject.Inject

class Combo(hasComboInjector: HasInjector<Combo>) : HasInjector<Meal>{
    init {
        GenericInjection.inject(this, hasComboInjector, Combo::class.java.name)
    }
    @Inject
    lateinit var coffee: Coffee

    @Inject
    lateinit var cake: Cake

    @Inject
    lateinit var dispatchingMealInjector: DispatchingAndroidInjector<Meal>

    override fun getInjector(): AndroidInjector<Meal> {
        return dispatchingMealInjector
    }

    fun show() {
        Log.d("kanna", "There are a ${coffee.name} and a ${cake.name} in the combo.")
    }

    fun offerMeal() {
        val meal = Meal(this)
        meal.show()
    }

}