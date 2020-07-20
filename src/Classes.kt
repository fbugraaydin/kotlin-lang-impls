fun main(args: Array<String>) {
    val p = Person("Name", "Surname")
    println(p.fullName)

    val tP = TurkishPerson("Bugra")
    println(tP.hello())

    val mike = PersonData("Mike",23,"Surname")
    println(mike.toString())

    val (name1,age1,surname1) = mike
    println("$name1 $age1 $surname1")

    val jake = mike.copy(name="Jake")
    println(jake)
}

// Primary Constructor
// name is read-only, age is mutable
class Person1(val name: String, var age: Int)

// Inheritance
open class Person2(val name: String) {
    open fun hello() = "Hello, I am $name"
    //Final by default so we need open
}

class TurkishPerson(name: String) : Person2(name) {
    override fun hello() = "Merhaba, Benim ismim $name"
}

// Properties with assessors
class Person(var name: String, var surname: String) {
    var fullName: String
        get() = "$name - $surname"
        set(value) {
            val (first, rest) = value.split(" ", limit = 2)
            name = first
            surname = rest
        }
}

// Data classes
data class PersonData(val name:String, var age:Int,var surname:String)


