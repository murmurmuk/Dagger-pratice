package murmur.daggerpratice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val coffeeShopComponent = DaggerCoffeeShop.create()
        val combo = Combo()
        DaggerCakeCabinet
                .builder()
                .coffeeShop(coffeeShopComponent)
                .build()
                .order(combo)
        combo.show()
    }
}
