package lesson4

const val IS_PRESENCE_OF_DAMAGE = false
const val CREW_LOWER_BOUND = 55
const val CREW_UPPER_BOUND = 70
const val MIN_FOOD_BOXES = 50
const val IS_FAVORABLE_WEATHER = true

fun main() {

    print("Судно имеет повреждения? ")
    val isPresenceOfDamage = readln().toBoolean()
    print("Введите число экипажа: ")
    val crew = readln().toInt()
    print("Введите количество ящиков на борту: ")
    val foodBoxes = readln().toInt()
    print("Погода благоприятная? ")
    val isFavorableWeather = readln().toBoolean()

    val result = (foodBoxes > MIN_FOOD_BOXES) &&
            (((isPresenceOfDamage == IS_PRESENCE_OF_DAMAGE) && (crew in CREW_LOWER_BOUND..CREW_UPPER_BOUND))
            ||
            ((isPresenceOfDamage != IS_PRESENCE_OF_DAMAGE) && (crew == CREW_UPPER_BOUND) && (isFavorableWeather == IS_FAVORABLE_WEATHER)))

    println("Корабль может отправиться в долгосрочное плавание? $result")

}