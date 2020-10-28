/**
 * The Delegation pattern has proven to be a good alternative to implementation inheritance
 * Compiler generate all methods of "by delegation obj."
 */
fun main(){

    val b = BaseImpl(12)
    Derived(b).printMessage()
    Derived(b).printMessageLine()
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