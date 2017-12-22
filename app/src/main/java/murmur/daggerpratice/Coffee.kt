package murmur.daggerpratice

import android.util.Log
import dagger.Binds
import dagger.Module
import javax.inject.Inject
import javax.inject.Qualifier

@Module
abstract class CoffeeModule {
    @Binds
    @Ice
    abstract fun provideIceCoffee(coffee: IceCoffee): Coffee

    @Binds
    @Hot
    abstract fun provideHotCoffee(coffee: HotCoffee): Coffee
}

@Qualifier
@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
annotation class Ice

@Qualifier
@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
annotation class Hot

open class Coffee {
    open fun show() {
        Log.d("kanna", "~coffee~")
    }
}

class IceCoffee @Inject constructor() : Coffee() {
    override fun show() {
        Log.d("kanna", "~ice coffee~")
    }
}

class HotCoffee @Inject constructor() : Coffee() {
    override fun show() {
        Log.d("kanna", "~hot coffee~")
    }
}