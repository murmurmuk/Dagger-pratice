package murmur.daggerpratice

import android.util.Log
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class CoffeeModule {
    @Provides
    @Named("ice")
    fun provideIceCoffee(): Coffee {
        return IceCoffee()
    }

    @Provides
    @Named("hot")
    fun provideHotCoffee(): Coffee {
        return HotCoffee()
    }
}

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