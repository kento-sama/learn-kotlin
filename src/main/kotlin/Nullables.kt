fun main() {
    var name: String = "Kent"
    // name = null // not allowed because by default, datatypes are not nullables

    var name2: String? = "Kent" // add ? to datatype to make it nullable
    name2 = null

    var age: Int = 29
    // age = null // not allowed

    var age2: Int? = 29
    age2 = null

    var firstName: String = "Kent"
    var length = firstName.length

    var secondName: String? = "Harvey"
    var length2 = secondName?.length // returns null if the variable is null else the length of the string
    println(length2)

    var length3 = if(secondName != null) secondName.length else 0 // returns 0 if the variable is null else the length of the string
    println(length3)

    var length4 = secondName?.substring(0, 6)?.length
    println(length4)

    var length5 = secondName?.substring(0, 6)?.drop(2)?.substring(0,4)?.length
    println(length5)

    // Elvis Operator
    var length6 : Int = secondName?.length ?: 0 // if left side is not null, return it else return 0

}