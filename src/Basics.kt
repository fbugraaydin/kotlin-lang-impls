fun main(args: Array<String>){
    val a = 5
    val b = 10
    var c = if(b/a==2) 2 else 2

    print(c)

    println("Hello World!")

    val nameConst = "March"
    var age = 5

    age++
    println(age)

    // Lazy Property
    val p: String by lazy{
        "I is a lazy string"
    }

    println(p)

    // Variables with nullable types

    var name:String? = null
    var length:Int

    // length, or 0 if name is null
    length = name?.length?:0
    println("Length : $length")

    // length, or throw error when name is null
    length = name?.length?:throw Error()
    print(length)

    // length, or return when name is null
    length = name?.length?:return
    println("Length : $length")

}

// Declaring function
fun sum(a:Int, b:Int): Int{
    return a + b;
}

//Single-expression function
fun sumSingle(a:Int,b:Int) = a + b

