package murmur.daggerpratice

import android.util.Log
import dagger.Module
import dagger.Provides
import javax.inject.Qualifier

@Module
class CoffeeModule {
    @Provides
    @Ice
    fun provideIceCoffee(): Coffee {
        return IceCoffee()
    }

    @Provides
    @Hot
    fun provideHotCoffee(): Coffee {
        return HotCoffee()
    }
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

class IceCoffee : Coffee() {
    override fun show() {
        Log.d("kanna", "~ice coffee~")
    }
}

class HotCoffee : Coffee() {
    override fun show() {
        Log.d("kanna", "~hot coffee~")
    }
}