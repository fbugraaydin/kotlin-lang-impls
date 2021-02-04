import kotlin.properties.Delegates

/**
 * The Delegation pattern has proven to be a good alternative to implementation inheritance
 * Compiler generate all methods of "by delegation obj."
 */
fun main(){

    val b = BaseImpl(12)
    Derived(b).printMessage()
    Derived(b).printMessageLine()

    println(lazyValue)
    println(lazyValue)

    val car = Car()
    car.model = "BMW"
    car.model = "Volkswagen"

}

interface Base{
    fun printMessage()
    fun printMessageLine()
}

class BaseImpl(val x:Int): Base{
    override fun printMessage() = print(x)
    override fun printMessageLine() = print(x)
}

class Derived(b: Base): Base by b{
    override fun printMessage() {
        println("abc")
    }
}

val lazyValue: String by lazy{
    println("computed")
    "Hello"
}

class Car {
    var model: String by Delegates.observable("Mercedes") { prop, old, new ->
        println("$old -> $new")
    }
}