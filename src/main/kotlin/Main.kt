
fun main() {
    val numbers = intArrayOf(1, 2, 3)
    val oceans = listOf("Atlantic", "Pacific")
    val oddList = listOf(numbers, oceans, "salmon")
    println(oddList)

    for (i in 1..5) print(i)
    println("")
    for (i in 5 downTo 1) print(i)
    println("")
    for (i in 1..5 step 2) print(i)
    println("")
    for (i in 'd'..'g') print (i)
    var bubbles = 0
    while (bubbles < 50) {
        bubbles++
    }
    println("$bubbles bubbles in the water\n")

    do {
        bubbles--
    } while (bubbles > 50)
    println("$bubbles bubbles in the water\n")

    repeat(2) {
        println("A fish is swimming")
    }

}