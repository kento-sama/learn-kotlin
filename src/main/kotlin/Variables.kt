fun main() {
    var fullName: String = "Kent Harvey" // a variable that can be modified
    println(fullName)

    fullName = ""
    println(fullName.isEmpty())

    val firstName: String = "Kent Harvey" // a variable that cannot be modified after declaration
    println(firstName)
    println(firstName::class)
    // firstName = "test" // error for trying to modify the variable
}