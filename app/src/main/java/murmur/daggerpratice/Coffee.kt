package murmur.daggerpratice

import android.util.Log
import dagger.Module
import dagger.Provides

@Module
class CoffeeModule{
    @Provides
    fun provideCoffee(): Coffee{
        return Coffee()
    }
}

class Coffee {
    fun show() {
        Log.d("kanna", "~coffee~")
    }
}
