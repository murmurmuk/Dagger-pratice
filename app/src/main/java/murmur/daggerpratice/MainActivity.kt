package murmur.daggerpratice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity() {
    @Inject
    @field:Named("hot")
    lateinit var coffee1: Coffee

    @Inject
    @field:Named("ice")
    lateinit var coffee2: Coffee

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerCoffeeShop.create().order(this)
        coffee1.show()
        coffee2.show()
    }
}
