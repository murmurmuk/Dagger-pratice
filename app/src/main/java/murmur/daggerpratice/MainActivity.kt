package murmur.daggerpratice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import murmur.daggerpratice.genericInjector.HasInjector
import murmur.daggerpratice.comboInjection.Combo
import javax.inject.Inject

class MainActivity : AppCompatActivity(), HasInjector<Combo> {
    @Inject
    lateinit var coffee: Coffee

    @Inject
    lateinit var dispatchingComboInjector: DispatchingAndroidInjector<Combo>

    override fun getInjector(): AndroidInjector<Combo> {
        return dispatchingComboInjector
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("kanna", "Get ${coffee.name} in MainActivity.")
        val combo = Combo(this)
        combo.show()
        combo.offerMeal()
    }

}
