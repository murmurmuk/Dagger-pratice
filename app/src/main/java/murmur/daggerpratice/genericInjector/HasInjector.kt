package murmur.daggerpratice.genericInjector

import dagger.android.AndroidInjector

interface HasInjector<T> {
    fun getInjector(): AndroidInjector<T>
}
