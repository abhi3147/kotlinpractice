
fun main() {
    println("How many fishes?")
    var numberOfFish: Int = (readln()).toInt()
    when(numberOfFish) {
        0 -> println("Empty Tank!")
        in 1..39 -> println("Got fish!")
        else -> println("That's a lot of fish!")
    }
}