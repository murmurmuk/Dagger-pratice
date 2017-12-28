package murmur.daggerpratice

import dagger.Subcomponent

@Subcomponent(modules = [CakeModule::class])
interface CakeCabinet {
    fun order(combo: Combo)

    @Subcomponent.Builder
    interface Builder {
        fun build(): CakeCabinet
    }
}
