fun main() {
    //integers
    val myByte: Byte = 8 //8-bit signed integer
    val myShort: Short = 16 // 15-bit signed integer
    val myInt: Int = 32 // 32-bit signed integer
    val myLong: Long = 64 // 64-bit signed integer

    println(myByte.toDouble()::class)
    println(myByte.toLong()::class)

    val bigLong: Long = 1_000_000
    println(bigLong)
    val bigInt: Int = 1_000_000
    println(bigInt)
    println((bigLong + bigInt)::class) // long + int = long

    //floating numbers
    val myFloat: Float = 32.00F //32-bit floating number
    val myDouble: Double = 64.00 // 64-bit floating number
    println(myFloat)
    println(myDouble)

    println("----------------")

    //Strings
    val fullName: String = "Kent Harvey"
    println(fullName.length)
    println(fullName.replaceFirstChar { firstChar ->
        println(firstChar)
        firstChar.lowercase()
    })
    println(fullName.lowercase())

    val c: Char = 'X' // 16-bit unicode character
    println(c)

    println("----------------")

    var multiMessage: String = """
        Hello!
        My name is Kent.
        How are you?
    """
    println(multiMessage)

    println("----------------")

    multiMessage = """
        Hello!
        My name is Kent.
        How are you?
    """.trimIndent() // does not include indentations

    println(multiMessage)

    println("----------------")

    multiMessage = """
        Hello!
        My name is Kent.
        How are you?
    """.replaceIndent("--->") // creates a new indentation

    println(multiMessage)

    println("----------------")

    multiMessage = """
        --->Hello!
        --->My name is Kent.
        --->How are you?
    """.trimMargin("--->") // removes the specified string from the original string

    println(multiMessage)

    println("----------------")
    val name: String = "Kent Harvey"
    val age: Int = 29
    val strFormat: String = """Hello,
        |I am $name.
        |I am $age years old.
        |My name has ${name.length} characters""".trimMargin()
    println(strFormat)

    println("----------------")
    //Booleans
    var isBlank: Boolean = false
    println(isBlank.not())
    isBlank = "Kent".isBlank()
    println(isBlank)
}