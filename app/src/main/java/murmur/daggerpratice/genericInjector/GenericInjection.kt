package murmur.daggerpratice.genericInjector

import android.util.Log


class GenericInjection {
    companion object {
        fun <T> inject(instance: T, hasInjector: HasInjector<T>, className: String) {
            if(instance == null){
                Log.e("dagger", "instance for $className is null")
                return
            }
            checkNotNull(hasInjector, { Log.e("dagger", "HasInjector for $className is null") })
            val injector = hasInjector.getInjector()
            checkNotNull(injector, { Log.e("dagger", "getInjector for $className is null") })
            injector.inject(instance)
        }
    }
}