package lesson4

const val PRESENCE_OF_DAMAGE = false
const val CREW_LOWER_BOUND = 55
const val CREW_UPPER_BOUND = 70
const val MIN_FOOD_BOXES = 50
const val FAVORABLE_WEATHER = true

fun main() {

    print("Судно имеет повреждения? ")
    val presenceOfDamage = readln().toBoolean()
    print("Введите число экипажа: ")
    val crew = readln().toInt()
    print("Введите количество ящиков на борту: ")
    val foodBoxes = readln().toInt()
    print("Погода благоприятная? ")
    val favorableWeather = readln().toBoolean()

    val result = (foodBoxes > MIN_FOOD_BOXES) &&
            (((presenceOfDamage == PRESENCE_OF_DAMAGE) && (crew in CREW_LOWER_BOUND..CREW_UPPER_BOUND))
            ||
            ((presenceOfDamage != PRESENCE_OF_DAMAGE) && (crew == CREW_UPPER_BOUND) && (favorableWeather == FAVORABLE_WEATHER)))

    println("Корабль может отправиться в долгосрочное плавание? $result")

}