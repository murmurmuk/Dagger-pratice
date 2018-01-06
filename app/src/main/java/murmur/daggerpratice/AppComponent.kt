package murmur.daggerpratice

import dagger.Component
import dagger.android.AndroidInjectionModule

@Component(modules = [AndroidInjectionModule::class, MainActivityModule::class])
interface AppComponent{
    fun inject(app: MyApp)
}