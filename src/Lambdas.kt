/**
 * Kotlin functions are first-class, which means that they can be stored in variables and data structures,
 * passed as arguments to and returned from other higher-order functions.
 * A higher-order function is a function that takes functions as parameters, or returns a function.
 */
fun main(){
    callMe(2,x)

    /**
     * if the last parameter of a function is a function, then a lambda expression passed as the
     * corresponding argument can be placed outside the parentheses known as trailing lambda.
     */
    callMe(2) { value -> "Y result $value" }

}

fun callMe(value:Int, method:(Int) -> String){
    method.invoke(value)
}

val x = fun(value:Int):String{
    return "X result $value"
}

/**
 *  If you don't need to specify return type, then can use anonymous functions.
 */
fun anonymousFunc(x: Int, y: Int): Int = x + y