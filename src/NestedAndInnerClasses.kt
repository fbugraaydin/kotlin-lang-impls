
fun main(){

    val foo = B.C().foo()

    val foo1 = A().Inner().foo()

}

/**
 * Without InnerClass; Class C cannot reach members of parent class.
 */
class B {
    private val value:Int = 1

    class C {
        fun foo() = 3
    }
}

/**
 * With Inner Class; Inner class can reach members of parent class.
 */
class A {
    private val value:Int = 1

    inner class Inner{
        fun foo() = value
    }
}

