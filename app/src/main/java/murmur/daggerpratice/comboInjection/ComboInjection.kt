package murmur.daggerpratice.comboInjection

import android.util.Log

class ComboInjection {
    companion object {
        fun inject(combo: Combo, hasComboInjector: HasComboInjector) {
            checkNotNull(combo, { Log.e("dagger", "Combo null") })
            checkNotNull(hasComboInjector, { Log.e("dagger", "HasComboInjector null") })
            val injector = hasComboInjector.comboInjector()
            checkNotNull(injector, { Log.e("dagger", "ComboInjector null") })
            injector.inject(combo)
        }
    }
}
