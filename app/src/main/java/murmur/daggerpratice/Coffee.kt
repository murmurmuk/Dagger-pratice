package murmur.daggerpratice

import android.util.Log
import dagger.Module
import dagger.Provides

@Module
class CoffeeModule{
    @Provides
    fun provideCoffee(@UserName userName: String): Coffee{
        return Coffee(userName)
    }
}

class Coffee (private val userName: String) {
    fun show() {
        Log.d("kanna", "$userName's ~coffee~")
    }
}

annotation class UserName