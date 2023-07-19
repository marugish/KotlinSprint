package lesson4

const val WEATHER_IS_SUNNY = true
const val TENT_IS_OPEN = true
const val AIR_HUMIDITY = 20
const val NOT_CURRENT_SEASON = "winter"

fun main() {

    val weatherIsSunnyToday = true
    val tentIsOpenToday = true
    val airHumidityToday = 20
    val currentSeasonToday = "winter"

    println("Благоприятные ли условия сейчас для роста бобовых? " +
            "${(weatherIsSunnyToday == WEATHER_IS_SUNNY) 
                    && (tentIsOpenToday == TENT_IS_OPEN) 
                    && (airHumidityToday == AIR_HUMIDITY) 
                    && (currentSeasonToday != NOT_CURRENT_SEASON)}")

}
