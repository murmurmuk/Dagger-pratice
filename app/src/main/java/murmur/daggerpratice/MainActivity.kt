package murmur.daggerpratice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import dagger.Lazy as DaggerLazy
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var coffee: DaggerLazy<Coffee>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerCoffeeShop.create().order(this)
        Log.d("kanna", "before get coffee")
        coffee.get().show()
    }
}
