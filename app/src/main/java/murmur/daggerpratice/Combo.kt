package murmur.daggerpratice

import javax.inject.Inject

class Combo {
    @Inject
    lateinit var coffee: Coffee
    @Inject
    lateinit var cake: Cake

    fun show() {
        coffee.show()
        cake.show()
    }
}