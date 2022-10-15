val topLevelName: String = "Kent Harvey"
var topLevelFirstName: String = "Kent Harvey"
var nullable: String? = "Hello" // '?' makes the variable nullable

var autoDataType = "hello" // Kotlin automatically detects it as a String


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
    // topLevelName = "test"
    println(topLevelFirstName)
    topLevelFirstName = "Modify"
    println(topLevelFirstName)

    println(nullable)
    if(nullable != null) {
        println(nullable)
    } else {
        nullable = "hello"
        println(nullable)
    }

    nullable = null

    when(nullable) {
        null -> println("The variable is null")
        else -> println(nullable)
    }

    val greetingToPrint = if(nullable != null) nullable else "hi"
    println(greetingToPrint)

    val greetingToPrint2 = when(nullable) {
        null -> "hi2"
        else -> nullable
    }

    println(greetingToPrint2)
}