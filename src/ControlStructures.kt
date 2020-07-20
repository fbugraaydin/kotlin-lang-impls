
fun main(args: Array<String>){

    // For Loop
    val list = listOf("A","B","C")
    for (element in list){
        println(element)
    }

    println(numberTypeName(3))

    println(signAsString(3))

}

// If as an expression
fun bigger(a:Int, b:Int) = if(a>b) a else b

// When expression
fun numberTypeName(x:Number) = when(x){
    0 -> "Zero"
    in 1..4 -> "Four or less"
    5,6,7 -> "Five to seven"
    is Byte -> "Byte"
    else -> "Some Number"
}

// When expression with predicates
fun signAsString(x:Int)=when{
    x > 0 -> "Negative"
    x==0 -> "Zero"
    else -> "Positive"
}



