
// to build  real world objects
// 1. Template/ blueprint for what your object should look like - CLASS
// 2. Use the template to create individual objects - INSTANCES (OBJECTS)
// Update the template so you can customize the properties to you suit your individual needs
class Car {
    // define the properties of a car
    // variables inside the class - explicit variable declaration
    // and you must provide a default value for those variables
    var model:String = "Honda Civic"
    // OPTION 1: Is the default value of the color going to be the same for all cars?
    // var color:String = "black"
    // OPTION 2: Or can the color be customized?
    var color:String
    var licensePlate:String


    var price:Double


    //  special function to your class called a constructor
    // Customize the default value of your properties
    constructor(lp:String, c:String) {
        println("++ DEBUG: Constructor #1 function is executing")
        licensePlate = lp
        color = c


        if (color === "blue") {
            price = 1000.0 - 125.0
        } else if (color === "orange") {
            price = 1000.0 * 1.25
        }
        else {
            price = 1000.0
        }


        println("++ DEBUG: Constructor #1 function is done!")
    }


    // classes can have MORE THAN ONE constructor
    constructor(lp:String) {
        println("++ DEBUG: Constructor #2 function is executing")
        color = "orange"
        licensePlate = lp


        price = 1000.0 * 1.25


        println("++ DEBUG: Constructor #2 function is done!")
    }


}




fun main() {
    println("DEMO OF CLASSES")
    // Using the class, create individual cars
    // Variable of type Car
    val c1:Car = Car("HND101", "black")
    println("car created!")
    // output the properties of your car using dot notation
    println(c1.model)
    println(c1.licensePlate)
    println(c1.color)
    println(c1.price)


    // orange by default
    // option 1: constructor #1
    val c2:Car = Car("CIV999", "orange")
    println("-----car 2 created: orange car with constructor #1----")
    println(c2.model)
    println(c2.licensePlate)
    println(c2.color)
    println(c2.price)
    println("-----car 3 created: orange car with constructor #2----")
    // option 2: use constructor #2
    val c3:Car = Car("HC131", "orange")
    println(c3.model)
    println(c3.licensePlate)
    println(c3.color)
    println(c3.price)
    println("-----car 4 created----")
    val c4:Car = Car("HC131", "blue")
    println(c4.model)
    println(c4.licensePlate)
    println(c4.color)
    println(c4.price)


}

