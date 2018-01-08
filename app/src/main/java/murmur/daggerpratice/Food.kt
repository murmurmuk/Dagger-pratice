package murmur.daggerpratice

import dagger.Module
import dagger.Provides

@Module
class FoodModule{
    @Provides
    fun provideFood(): Food{
        return Food("steak")
    }
}

data class Food(val name: String)