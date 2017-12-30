package murmur.daggerpratice

import dagger.Component
import dagger.android.AndroidInjectionModule

@Component(modules = [AndroidInjectionModule::class, AppModule::class])
interface AppComponent{
    fun inject(app: MyApp)
}