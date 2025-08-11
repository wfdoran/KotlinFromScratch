fun main(args : Array<String>) {
    val a = 20
    val b = 7
    val q_int = a / b
    val q_float = a.toDouble() / b

    println(q_int)
    println(q_float)


    var s = "Hello"
    s += " World!"
    println(s)


    var x = 10
    val y = x++

    println(y)
    println(x)

    val name = "John"
    val greet = "Hello $name, how are you?"
    println(greet)

}