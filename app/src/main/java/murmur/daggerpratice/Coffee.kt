package murmur.daggerpratice

import dagger.Module
import dagger.Provides
import javax.inject.Qualifier

@Module
class CoffeeModule {
    @Provides
    @Ice
    fun provideIceCoffee(): Coffee {
        return Coffee("Ice coffee")
    }

    @Provides
    @Hot
    fun provideHotCoffee(): Coffee {
        return Coffee("Hot coffee")
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

data class Coffee(val name: String)