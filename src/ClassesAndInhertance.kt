fun main() {

    // # - 1 Secondary Constructor
    val constructor = SecondaryConstructor("firstName", "lastName");

    // # - 2 Singleton Class
    val instance1 = SingletonClass
    val instance2 = SingletonClass

    println("Instance1 value : ${instance1.value}")
    println("Instance2 value : ${instance2.value}")
    instance1.toLower()

    println("Instance1 value : ${instance1.value}")
    println("Instance2 value : ${instance2.value}")


    // # - 3 Companion Objects
    /**
    There is one important semantic difference between object expressions and object declarations:
    - object expressions are executed (and initialized) immediately, where they are used;
    - object declarations are initialized lazily, when accessed for the first time;
    - a companion object is initialized when the corresponding class is loaded (resolved), matching the semantics of a Java static initializer.
     */
    val f: Factory<MyClass> = MyClass

}

class SecondaryConstructor constructor(firstName: String) {
    init {
        println("Init block")
    }

    constructor(name: String, firstName: String) : this(name) {
        println("Secondary Constructor")
    }
}

object SingletonClass {
    var value = "DEFAULT"

    fun toLower() {
        value = value.toLowerCase()
    }
}

interface Factory<T> {
    fun create(): T
}

class MyClass {
    companion object : Factory<MyClass> {
        override fun create(): MyClass = MyClass()
    }
}
