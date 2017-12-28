package murmur.daggerpratice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val combo = Combo()
        DaggerCoffeeShop
                .builder()
                .userName("kanna")
                .build()
                .getCabinet()
                .build()
                .order(combo)
        combo.show()

    }
}
