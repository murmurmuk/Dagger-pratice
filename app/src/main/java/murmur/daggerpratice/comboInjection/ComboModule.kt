package murmur.daggerpratice.comboInjection

import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap
import dagger.MapKey
import murmur.daggerpratice.CakeCabinet
import kotlin.reflect.KClass



@Module(subcomponents = [CakeCabinet::class])
abstract class ComboModule {
    @Binds
    @IntoMap
    @ComboKey(Combo::class)
    abstract fun bindCombonjectFactory(builder: CakeCabinet.Builder)
            : AndroidInjector.Factory<out Combo>
}

@MapKey
annotation class ComboKey(val value: KClass<out Combo>)