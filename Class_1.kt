fun main() {
    // class 1
    var car1 = car()
    var car2 = car()
    car1.name = "Toyota luxis 570"
    car1.brand = "Toyota"
    car1.color = "Dark Gold"
    car1.year = 2023

    car2.name = "Toyota luxis 570"
    car2.brand = "Toyota"
    car2.color = "Blue Gold"
    car2.year = 2025

    //class 2
    var names = name("phanit", "so", 19)

    //class 3
    val person = Name1("Gu", "Zhen Ren", 99)
    //class 3 same
    val person1 = Person1("Gu Yue", "Fang Yuan", 10000)
    //class 4
    val personal = Personal("Wang", "Lin", 5000)


    // class 1
    println("Car Name :${car1.name}")
    println("Car Brand :${car1.brand}")
    println("Car Color :${car1.color}")
    println("Car Year :${car1.year}")
    println("\nCar Name :${car2.name}")
    println("Car Brand :${car2.brand}")
    println("Car Color :${car2.color}")
    println("Car Year :${car2.year}")

    //class 2
    println("\nThis is your first name: ${names.f_name}")
    println("This is your last name: ${names.l_name}")
    println("This is your age: ${names.age}")

    //class 3
    println("\nThis is your age: ${person.age}")
    println("This is your first name: ${person.firstName}")
    println("This is your last name: ${person.lastName}")

    //class 3 the same
    person1.showInfo()

}

//class 1 (Normal Class)
class car {
    //this is propoty
    var name = ""
    var brand = ""
    var color = ""
    var year = 0
}
//======================================================================================================================

// class 2 (Parameter Class)
class name(first_name: String, last_name: String, age: Int) {
    // inside class () is a parameter [ NO value or var,val ]
    //this is propoty
    var f_name = first_name
    var l_name = last_name
    var age = age
}

//======================================================================================================================

//class 3 (propoty) លក្ខណសម្បត្តិ
class Name1(val firstName: String, val lastName: String, val age: Int){
}
// inside the class () is a propoty [with value or val,var ]


//======================================================================================================================

//class 3 (propoty) same like class 3
class Person1(var firstName: String, var lastName: String, var age: Int) {
    fun showInfo() {
        println("\nFirst Name: $firstName ")
        println("Last Name: $lastName")
        println("Age: $age+")
    }
}

//======================================================================================================================

//class 4 Initialize class (we can write multiple code in block Init it can print directly  doesn't need to print on main fun)
class Personal(firstName: String, var lastName: String, var age: Int) {
    val fi_name =firstName
    init {
        println("New person created: $fi_name $lastName")
        println("Age: $age")
    }
}