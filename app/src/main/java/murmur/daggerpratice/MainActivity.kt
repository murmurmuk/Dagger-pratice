package murmur.daggerpratice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var coffee: Coffee


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerCoffeeShop
                .builder()
                .userName("kanna")
                .build()
                .order(this)
        coffee.show()
    }
}
