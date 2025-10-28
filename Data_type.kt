fun main() {
    val string: String = "Mrr.gu"
    val integer: Int = 10
    val float: Float = 1.9F
    val double: Double = 1.9
    val char: Char = 'M'
    val boolean: Boolean = true

    println("this is string : $string")
    println("this is integer : $integer")
    println("this is Float : $float")
    println("this is Double : $double")
    println("this is Char : $char")
    println("this is Boolean : $boolean")

    int_type()
}

fun int_type() {
    val maxlong = Long.MAX_VALUE
    val minlong = Long.MIN_VALUE

    val maxint = Int.MAX_VALUE
    val minint = Int.MIN_VALUE

    val maxshort = Short.MAX_VALUE
    val minshort = Short.MIN_VALUE

    val maxdouble = Double.MAX_VALUE
    val mindouble = Double.MIN_VALUE

    val maxfloat = Float.MAX_VALUE
    val minfloat = Float.MIN_VALUE

    val length = maxint.toString().length
    val length1 = maxlong.toString().length
    val length2 = maxshort.toString().length

    println("max long :$maxlong")
    println("min long :$minlong")

    println("max short :$maxshort")
    println("min short :$minshort")

    println("max int :$maxint")
    println("min int :$minint")

    println("max double :$maxdouble")
    println("min double :$mindouble")

    println("max float :$maxfloat")
    println("min float :$minfloat")

    println("Int digits: $length")
    println("Long digits: $length1")
    println("Short digits: $length2")
}