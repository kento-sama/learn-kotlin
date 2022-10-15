val topLevelName: String = "Kent Harvey"
var topLevelFirstName: String = "Kent Harvey"

fun main(args: Array<String>) {
    println("Hello World!")

    println("Program arguments: ${args.joinToString()}")

    val name: String = "Kent Harvey" // "val" creates a variable that cannot be modified
    // name = "rename" // creates an error when trying to reassign the variable

    var firstName: String = "Kent Harvey" // "var" creates a variable that can be modified
    println(firstName)
    firstName = "New Name" // does not generate an error when reassigning a new value

    println(name)
    println(firstName)

    println(topLevelName)
    println(topLevelFirstName)
}