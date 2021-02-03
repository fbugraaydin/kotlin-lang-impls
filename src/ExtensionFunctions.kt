fun main(){

    val calculator = Calculator()
    println(calculator.sum(2,3))
    println(calculator.multiply(2,3))

    println(Calculator.extract(3,2))

}

class Calculator{
    fun sum(num1:Int, num2:Int):Int = num1 + num2
    companion object {}
}

fun Calculator.multiply(num1:Int, num2:Int):Int = num1 * num2

/**
 * Companion object extensions
 */
fun Calculator.Companion.extract(num1:Int, num2:Int):Int = num1 - num2

