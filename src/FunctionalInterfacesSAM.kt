fun main(){

    // # - 1 Without SAM conversion
    // creating anonymous class
    val isEven = object : IntPredicate{
        override fun accept(i: Int): Boolean {
            return i %2 == 0
        }
    }

    // # - 2 With Sam Conversion
    val isEvenSAM = IntPredicate { it % 2 == 0}
}

fun interface IntPredicate {
    fun accept(i: Int): Boolean
}