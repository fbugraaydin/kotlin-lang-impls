fun main() {
    println(listOf(1, 2, 3, 4)) //List<Int>
    println(mutableListOf(1, 2, 3, 4))//MutableSet<String>

    println(setOf("A", "B", "C"))//Set<String>
    println(mutableSetOf("A", "B", "C"))//MutableSet<String>

    println(arrayOf('a', 'b', 'c'))

    println(mapOf(1 to "A", 2 to "B"))//Map<Int,String>
    println(mutableMapOf(1 to "A", 2 to "B")) // MutableMap<Int,String>

    println(sequenceOf(4, 3, 2, 1))//Sequence<Int>

    println(1 to "A") // Pair<Int,String>

    println(List(4) { it * 2 })//List<Int>
    println(generateSequence(4) { it + 2 }) //Sequence<Int>

}