package murmur.daggerpratice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    @field:Hot
    lateinit var coffee1: Coffee

    @Inject
    @field:Ice
    lateinit var coffee2: Coffee

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerCoffeeShop.create().order(this)
        coffee1.show()
        coffee2.show()
    }
}
