package murmur.daggerpratice

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class AppModule {
    @ContributesAndroidInjector(modules = [CoffeeModule::class])
    abstract fun CoffeeShop(): MainActivity
}