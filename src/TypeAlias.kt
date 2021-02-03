fun main(){

    val totalFunc: TotalFunc<Int,Int> = {a,b -> a +b}
    println(gotIt(totalFunc, 2,4))

    val student = Student("name1",20)
    val student2 = Student("name2",21)
    val student3 = Student("name3",22)

    val studentList: StudentList = listOf(student,student2,student3)
    listStudents(studentList)
}

typealias TotalFunc<T,K> = (T,K) -> Int


fun gotIt(totalFunc: TotalFunc<Int,Int>, a:Int, b:Int):Int{
    return totalFunc(a,b)
}

class Student(val name:String,val age:Int)

typealias StudentList = List<Student>

fun listStudents(list: StudentList){
    list.forEach { println("Name => ${it.name}, Age => ${it.age}") }
}
