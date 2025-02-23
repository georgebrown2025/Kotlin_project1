import jdk.internal.org.jline.utils.Colors.s

fun addNumber(a:Double, b:Int) {
    val result = a+b
    println("The sum of ${a} and ${b} is ${result}")
}

fun addNumber(a:Int, b:Int) {
    val result = a+b
    println("The sum of ${a} and ${b} is ${result}")
}

fun addNumber(a:Double, b:Double) {
    val result = a+b
    println("The sum of ${a} and ${b} is ${result}")
}

fun main() {
    addNumber(10, 200)
    addNumber(10.0, 200)
    addNumber(10.0,200.0)
}