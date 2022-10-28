fun main() {
    // Structural
    var name1 = "Kent"
    var name2 = "Harvey"

    println(name1 == name2)
    println(name1.equals(name2))

    // Referential
    var a = 12.0
    var b = 12.0

    println(a === b) // == and === works the same if used on primitive data types (numbers, booleans, chars)

    // === compares if 2 objects are the same
    /**
     * var person1 = Person("Kent")
     * var person2 = Person("Kent)
     *
     * println(person1 === person2) // prints false because it's 2 different objects
     *
     */
}