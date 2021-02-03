fun main(){
    Name.A.speak()
}

enum class Name{
    A{
        override fun speak() {
            println("It is me")
        }
    };

    abstract fun speak()
}