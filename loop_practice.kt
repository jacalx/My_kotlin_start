fun main() {
    var min = maxi(arrayOf(12, 22, 11, 1, 2, 66, 12, 5), is_max = false)
    var max = maxi(arrayOf(12, 22, 11, 1, 2, 66, 12, 5), is_max = true)
    println("min value is:$min")
    println("max value is:$max")


}

fun maxi(names: Array<Int>, is_max: Boolean): Int {
    var max = names[0]
    var min = names[0]
    if (is_max) {
        for (name in names) {
            if (name > max) {
                max = name
            }
            
        }
        return max
    } else {
        for (name in names) {
            if (name < min) {
                min = name
            }
        }
        return min
    }


}