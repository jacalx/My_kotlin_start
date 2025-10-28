fun main() {
    var name =0

    for (ir in 0..10){
        if (ir in 4..8){
            continue
        }
        println(ir)
    }
    // Method 1
    for (ii in 1..10) {
        println(ii)
    }
    println()

    // Method 2
    for (o in 1 until 10) {
        println(0)
    }
    println()

    // Method 3
    for (l in 1 until 10 step 2) {
        println(l)
    }
    println()

    // Method 4
    for (p in 10 downTo 1) {
        println(p)
    }
    println()

    // Method 5
    for (y in 10 downTo 1 step 2) {
        println(y)
    }
    println()

    //Method 5 with condiction
    for (i in 0..10){
        if (i in 4..8){
            continue
        }
        println(i)
    }
}
