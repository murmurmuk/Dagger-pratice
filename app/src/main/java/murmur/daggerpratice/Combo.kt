package murmur.daggerpratice

import android.util.Log
import javax.inject.Inject

class Combo {
    @Inject
    lateinit var coffee: Coffee

    @Inject
    lateinit var cake: Cake

    fun show() {
        Log.d("kanna", "${coffee.name} with ${cake.name}")
    }
}
