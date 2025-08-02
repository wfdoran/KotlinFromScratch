/**
 *  Generate hello string to a person
 * 
 *  @param name The person's name
 *  @return The greeting string
 */

fun greet(name: String): String {
    return "Hello, $name!"
}

fun main(args : Array<String>) {
    val name = "World"
    println(greet(name))
}