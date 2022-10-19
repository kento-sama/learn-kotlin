/*fun getGreeting(): String {
    return "Hello world"
}*/

fun getGreeting() = "Hello World"

/*fun sayHello(greeting: String, nameToGreet: String) {
    println("$greeting, $nameToGreet")
}*/

fun sayHello(greeting: String, nameToGreet: String) = println("$greeting, $nameToGreet!")


fun main(args: Array<String>) {
    sayHello("Hey","Kent")
    sayHello("Hello", "World")
}