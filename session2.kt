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




    var speed:Int = 0


    fun accelerate(speed:Int) {
        println("The car is increasing speed!")
        this.speed += speed
    }
    fun brake() {
        println("The car is stopped!")
        speed = 0
    }


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


    override fun toString(): String {
        return "Car(model='$model', color='$color', licensePlate='$licensePlate', price=$price, speed=$speed)"
    }




}






class Book {
    // properties
    var title:String
    var author:String
    var yearPublished:Int
    var numPage:Int
    var price:Double


    constructor(title: String, author: String, yearPublished: Int, numPage: Int, price: Double) {
        this.title = title
        this.author = author
        this.yearPublished = yearPublished
        this.numPage = numPage
        this.price = price
    }


    override fun toString(): String {
        return "Book(title='$title', author='$author', yearPublished=$yearPublished, numPage=$numPage, price=$price)"
    }


}




fun main() {
    println("DEMO OF CLASSES")
    // Using the class, create individual cars
    // Variable of type Car
    val c1:Car = Car("HND101", "black")
    println("car created!")


    // orange by default
    // option 1: constructor #1
    val c2:Car = Car("CIV999", "orange")
    println("-----car 2 created: orange car with constructor #1----")




    println("-----car 3 created: orange car with constructor #2----")
    // option 2: use constructor #2
    val c3:Car = Car("HC131", "orange")




    println("-----car 4 created----")
    val c4:Car = Car("HC131", "blue")


    println(c1)         //toString()
    println(c2.toString())
    println(c3)
    println(c4)




    var b1:Book = Book("Harry Potter", "JK Rowling", 1997, 200, 21.99)
    println(b1)


    println(c1)
    c1.accelerate(10)         // +5
    c1.accelerate(7)         // +5
    c1.accelerate(3)         // +5
    c1.accelerate(50)         // +5
    println(c1)
    c1.brake()
    println(c1)


}
