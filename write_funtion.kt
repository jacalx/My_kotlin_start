fun main() {
    //Method 1
    var num1 = cal(20, 11, 1)
    //Method 2
    var num2 = cal1(20, 11, 1)
    //Method 3
    var num3 = cal2(20, 11, 1)
    //Method 4
    var num4 = cal3()

    println("This is value of Method 1 :$num1")

    println("This is value of Method 2 :$num2")

    println("This is value of Method 3 :$num3")

    println("This is value of Method 4 :$num4")


    //Method 5
    println("This is value of Method 5 :${cal4(20, 11, 1)}")

    //Method 6
    println("This is value of Method 6 :${calc(5)}")        // uses default b=0, c=0 → prints 5
    println("This is value of Method 6 :${calc(5, 2)}")     // uses default c=0 → prints 7
    println("This is value of Method 6 :${calc(5, 2, 1)}")  // prints 8

}

//Method 1
fun cal(a: Int, b: Int, c: Int) = a + b + c


//Method 2
fun cal1(a: Int, b: Int, c: Int): Int {
    return a - b - c
}

//Method 3
fun cal2(a: Int, b: Int, c: Int): Int {
    val result = a * b * c
    return result
}

//Method 4
fun cal3(a: Int = 20, b: Int = 11, c: Int = 1): Int = a + b + c

//Method 5
fun cal4(a: Int, b: Int, c: Int) = a + b + c

//Method 6
fun calc(a: Int = 0, b: Int = 0, c: Int = 0) = a + b + c




