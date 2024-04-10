
fun main() {
    var fishFoodTreats : Int? = null
    fishFoodTreats = fishFoodTreats?.dec() ?: 0
    println(fishFoodTreats)

    val school = listOf("mackerel","trout","halibut")
    println(school)

    val myList = mutableListOf("tuna", "salmon", "shark")
    myList.remove("shark")



}