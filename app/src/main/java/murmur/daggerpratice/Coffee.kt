package murmur.daggerpratice

import android.util.Log
import javax.inject.Inject

class Coffee @Inject constructor(){
    fun show(){
        Log.d("kanna", "~coffee~")
    }
}
