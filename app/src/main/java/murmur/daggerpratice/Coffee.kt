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
    fun provideHotCoffee(@UserName userName: String): Coffee {
        return HotCoffee(userName)
    }

    @Provides
    @Named("ice-combo")
    fun provideCombo(@Named("ice") coffee: Coffee): Combo {
        return Combo(coffee)
    }

    @Provides
    @Named("hot-combo")
    fun provideHotCombo(@Named("hot") coffee: Coffee): Combo {
        return Combo(coffee)
    }
}

class Combo(private val coffee: Coffee) {
    fun show() {
        Log.d("kanna", "Cake with")
        coffee.show()
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

class HotCoffee(@UserName private val userName: String) : Coffee() {
    override fun show() {
        Log.d("kanna", "~hot coffee~ for $userName")
    }
}

annotation class UserName