import java.io.File

fun main(args: Array<String>) {

    ClassHasCompanionObjects.companionFunc()

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

    println(Resource.name)

    val files = File("Test").listFiles()

    println(files?.size?: "empty")
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
    override fun hello() = "Hi, my name is $name"
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

// Make singleton
object Resource{
    val name = "Singleton Object Name"
}


class ClassHasCompanionObjects(name: String){
    companion object{
        fun companionFunc(){
            println("It is companion object function!")
        }
    }

}

/**
 * Can override properties of Interface.
 * Functions can have body like fault method in java.
 */
interface MyInterface {
    val prop: Int // abstract

    val propertyWithImplementation: String
        get() = "foo"

    fun foo() {
        print(prop)
    }
}

class Child : MyInterface {
    override val prop: Int = 10
}

