class Car{
    val licensePlate:String = "ABCD1234"
    val model:String = "Honda Civic"
}

fun main() {
    println("Demo of classes!")
    val c1:Car = Car()
    println("Car Created!")

    println(c1.model)
    println(c1.licensePlate)

    val c2:Car = Car()
    println("Car Created!")

    println(c2.model)
    println(c2.licensePlate)

    println(c1)
    println(c2)
}