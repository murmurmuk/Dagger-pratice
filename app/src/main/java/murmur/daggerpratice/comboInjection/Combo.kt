package murmur.daggerpratice.comboInjection

import android.util.Log
import murmur.daggerpratice.Cake
import murmur.daggerpratice.Coffee
import murmur.daggerpratice.genericInjector.GenericInjection
import murmur.daggerpratice.genericInjector.HasInjector
import javax.inject.Inject

class Combo(hasComboInjector: HasInjector<Combo>) {
    init {
        GenericInjection.inject(this, hasComboInjector, Combo::class.java.name)
    }
    @Inject
    lateinit var coffee: Coffee

    @Inject
    lateinit var cake: Cake

    fun show() {
        Log.d("kanna", "There are a ${coffee.name} and a ${cake.name} in the combo.")
    }
}