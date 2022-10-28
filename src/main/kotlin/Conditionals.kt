fun main() {
    val calories = 1600
    if (calories > 2000) {
        println("Too much")
    } else if(calories < 2000 && calories > 1500) {
        println("Eat more")
    } else {
        println("Low")
    }

    val age = 18
    if (age > 20) println("Too old") else println("Too young")
}