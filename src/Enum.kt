fun main(){
    actAnimal(Animal.CAT)
    actAnimal(Animal.CAT)
}

fun actAnimal(animal:Animal){
    animal.talk()
}

enum class Animal{
    DOG{
        override fun talk() {
            println("Dog talking")
        }
    },
    CAT {
        override fun talk() {
            println("Dog talking")
        }
    };

    abstract fun talk()
}