package murmur.daggerpratice

import android.util.Log
import javax.inject.Inject

class Combo {
    @Inject
    @field:Ice
    lateinit var coffee: Coffee

    @Inject
    @field:Hot
    lateinit var coffee2: Coffee

    @Inject
    lateinit var cake: Cake

    fun show() {
        Log.d("kanna", "${coffee.name}, ${coffee2.name} with ${cake.name}")
    }
}
