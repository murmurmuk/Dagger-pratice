package murmur.daggerpratice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity() {
    @Inject
    @field:Named("ice-combo")
    lateinit var combo: Combo

    @Inject
    @field:Named("hot-combo")
    lateinit var combo2: Combo


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerCoffeeShop
                .builder()
                .userName("kanna")
                .build()
                .order(this)
        combo.show()
        combo2.show()
    }
}
