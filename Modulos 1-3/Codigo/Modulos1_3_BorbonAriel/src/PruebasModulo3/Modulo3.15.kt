package PruebasModulo3

fun main() {
    print("How are you feeling today? ")
    val mood = readLine()!!

    println(whatShouldIDoToday2(mood))
}

fun whatShouldIDoToday2(mood: String, weather: String = "sunny", temperature: Int = 24): String {
    return when {
        isHappySunny(mood, weather) -> "go for a walk"
        isSadRainyCold(mood, weather, temperature) -> "stay in bed"
        isTooHot(temperature) -> "go swimming"
        else -> "Stay home and read."
    }
}


fun isHappySunny(mood: String, weather: String) = mood == "happy" && weather == "sunny"

fun isSadRainyCold(mood: String, weather: String, temp: Int) = mood == "sad" && weather == "rainy" && temp == 0

fun isTooHot(temperature: Int) = temperature > 35