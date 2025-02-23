fun checktype() {
    val p = 200
    println("This is inside function.")
    println("The value of y is: ${p}")
    println("The variable type of p is: ${p::class.simpleName}")

    val q = 3.14
    println("The value of q is: ${q}")
    println("The variable type of q is: ${q::class.simpleName}")
}

fun declare() {
    val u = 255
    val a:Int = 100
    val b:String = "abc"
    val c:Boolean = false
    val d:Double = 9.188
}

fun sayhello2(phrase:String) {
    println("This is the phrase: ${phrase}")
}

fun squareof(number:Int) {
    println("The square root of ${number} is: ${number*number}")
}

fun additionof(t:Int, p:Int) {
    println("The sum of ${t} and ${p} is: ${(t+p)}")
}


fun main() {
    var y = 100
    y = 101
    println("${y}")
    y = -5
    println(y)
    // y = "ABCD"
    checktype()
    declare()
    sayhello2("How are you?")
    sayhello2("Have a nice day.")
    sayhello2("Have a great day indeed!")

    squareof(5)
    additionof(15, 35)
}

