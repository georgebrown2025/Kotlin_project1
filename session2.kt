class Car{
    var licensePlate:String = "ABCD1234"
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

    println("Proof that c1 and c2 are different")
    c2.licensePlate = "HONDA101"

    println("What is c1? ${c1.licensePlate} What is c2? ${c2.licensePlate}")

}