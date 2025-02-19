

// Update the template so you can customize the properties to you suit your individual needs
class Car {
    // define the properties of a car
    // variables inside the class - explicit variable declaration
    // and you must provide a default value for those variables
    var licensePlate:String
    var model:String = "Honda Civic"


    //  function to your class called a constructor
    // Customize the default value of your properties
    constructor(lp:String) {
        licensePlate = lp
    }
}


fun main() {
    println("DEMO OF CLASSES")
    // Using the class, create individual cars
    // Variable of type Car
    val c1:Car = Car("HND101")
    println("car created!")
    // output the properties of your car using dot notation
    println(c1.model)
    println(c1.licensePlate)


    val c2:Car = Car("CIV999")
    println("-----car 2 created----")
    println(c2.model)
    println(c2.licensePlate)


    println("---prove that c1 and c2 are different by output memory locations -----")
    println(c1)
    println(c2)


    println("---prove that c1 and c2 are different by changing property values-----")
    c2.licensePlate = "HONDA101"


    println("What is c1? ${c1.model} ${c1.licensePlate}")
    println("What is c2? ${c2.model} ${c2.licensePlate}")


}

