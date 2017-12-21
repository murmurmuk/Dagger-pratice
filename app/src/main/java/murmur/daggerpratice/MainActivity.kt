package murmur.daggerpratice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import javax.inject.Inject
import javax.inject.Provider

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var coffeeProvider: Provider<Coffee>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerCoffeeShop.create().order(this)
        for (i in 1..3) {
            Log.d("kanna", "order $i")
            coffeeProvider.get().show()
        }
    }
}
