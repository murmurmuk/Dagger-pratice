package murmur.daggerpratice

import dagger.Module
import dagger.Provides

@Module
class CakeModule{
    @Provides
    fun provideCake(): Cake{
        return Cake("strawberry cake")
    }
}

data class Cake(val name: String)
