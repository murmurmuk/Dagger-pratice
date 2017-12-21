package murmur.daggerpratice

import android.util.Log
import javax.inject.Inject

class Coffee @Inject constructor(){
    init {
        Log.d("kanna", "create coffee " + this)
    }
    fun show(){
        Log.d("kanna", "~coffee~")
    }
}
