package lesson4

const val NUMBER_OF_RESTAURANT_TABLES = 13

fun main() {

    val bookingForToday = NUMBER_OF_RESTAURANT_TABLES
    val bookingForTomorrow = NUMBER_OF_RESTAURANT_TABLES - 4

    println("Доступность столиков на сегодня: ${bookingForToday < NUMBER_OF_RESTAURANT_TABLES},\n" +
            "Доступность столиков на завтра: ${bookingForTomorrow < NUMBER_OF_RESTAURANT_TABLES}")

}