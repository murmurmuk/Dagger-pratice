package murmur.daggerpratice

import dagger.Module
import dagger.Provides

@Module
class CakeModule {
    @Provides
    fun provideCake(): Cake {
        return Cake("Strawberry cake")
    }
}

data class Cake(val name: String)

