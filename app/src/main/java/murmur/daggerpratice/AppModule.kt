package murmur.daggerpratice

import android.app.Activity
import dagger.Binds
import dagger.Module
import dagger.android.ActivityKey
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap

@Module(subcomponents = [CoffeeShop::class])
abstract class AppModule {
    @Binds
    @IntoMap
    @ActivityKey(MainActivity::class)
    abstract fun bindMainActivityInjectFactory(builder: CoffeeShop.Builder)
            : AndroidInjector.Factory<out Activity>
}