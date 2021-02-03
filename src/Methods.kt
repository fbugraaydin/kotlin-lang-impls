
fun main(){
    val myTurtle = Turtle().apply {
        name = "Turtle"
    }

    with(myTurtle){
        penDown()
        for(i in 1..4){
            forward(100.0)
            turn(90.0)
        }
        penUp()
    }
}

class Turtle{
    lateinit var name:String
    fun penDown(){

    }
    fun penUp(){

    }
    fun turn(degress: Double){

    }
    fun forward(pixels: Double){

    }
}
