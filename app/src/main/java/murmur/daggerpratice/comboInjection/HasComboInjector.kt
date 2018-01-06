package murmur.daggerpratice.comboInjection

import dagger.android.AndroidInjector

interface HasComboInjector {
    fun comboInjector(): AndroidInjector<Combo>
}