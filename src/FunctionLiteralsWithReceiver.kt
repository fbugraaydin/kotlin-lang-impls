fun main(args: Array<String>) {

    // # - 1
    printResult(4) {
        this * this
    }

    // # - 2
    Staff().apply {
        name = "Software"
        surname = "Developer"
        printFullName()
    }

    // # - 3 DSL
    html {
        body()
    }

}

fun html(init:HTML.() -> Unit): HTML{
    val html = HTML()
    html.init()
    return html
}

class HTML{
    fun body(){
        println("Body")
    }
}

class Staff {
    var name: String? = null
    var surname: String? = null

    fun printFullName() = print("$name $surname")

}

private fun printResult(number:Int, pow:Int.() -> Unit) = number.pow()



