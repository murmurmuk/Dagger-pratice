package murmur.daggerpratice.comboInjection

import android.util.Log
import murmur.daggerpratice.Cake
import murmur.daggerpratice.Coffee
import javax.inject.Inject

class Combo(hasComboInjector: HasComboInjector) {
    init {
        ComboInjection.inject(this, hasComboInjector)
    }
    @Inject
    lateinit var coffee: Coffee

    @Inject
    lateinit var cake: Cake

    fun show() {
        Log.d("kanna", "There are a ${coffee.name} and a ${cake.name} in the combo.")
    }
}