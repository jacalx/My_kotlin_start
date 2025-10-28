fun main() {

    var name: Int = 0
    var names: Int = 0
    var age: Int = 10
    var ages: Int =0
    var namee: Int = 0

// While loop (do whenever condiction are True)
    println("This is while Loop")

    while (name < 10) {
        println(name)
        name++
    }

//Do loop (do at least one before end program even condiction are False)
    println("This is Do Loop")
    do {
        println(name)
    } while (age < 10)


    //increase later (if condiction hit if statement and continue it will break other condiction
    while (names<10){
        if(names == 7){
            continue
        }
        println(names)
        name++
    }


    // increase before
    while (ages < 10) {
        ages++
        // if (ages > 2 || age < 8)
        if (ages > 2 && age < 8) {
            continue
        }
        println(ages)
    }
    // break loop
    while (namee<10){
        namee++
        if(namee ==8){

            break
        }
        println(namee)
    }
}


