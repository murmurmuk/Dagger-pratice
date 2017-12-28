package murmur.daggerpratice

import android.util.Log
import dagger.Module
import dagger.Provides

@Module
class CakeModule {
    @Provides
    fun provideCake(@UserName userName: String): Cake {
        return Cake(userName)
    }
}

class Cake(private val userName: String) {
    fun show() {
        Log.d("kanna", "$userName's strawberry cake")
    }
}
