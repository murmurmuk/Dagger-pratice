package murmur.daggerpratice

import dagger.Module
import dagger.Provides

@Module
class CoffeeModule{
    @Provides
    fun provideCoffee(): Coffee{
        return Coffee("coffee")
    }
}

data class Coffee(val name: String)
