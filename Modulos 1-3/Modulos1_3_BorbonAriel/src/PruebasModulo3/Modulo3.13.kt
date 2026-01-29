package PruebasModulo3

fun main() {
    println(whatShouldIDoToday("happy"))

    println(whatShouldIDoToday("happy", "rainy"))

    println(whatShouldIDoToday("sad", "rainy", 0))

    print("How is your mood? ")
    val userMood = readLine()!!
    println(whatShouldIDoToday(userMood))
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String {

    return when {
        mood == "happy" && weather == "sunny" -> "go for a walk"
        mood == "sad" && weather == "rainy" && temperature == 0 -> "stay in bed"
        temperature > 35 -> "go swimming"
        else -> "Stay home and read."
    }
}