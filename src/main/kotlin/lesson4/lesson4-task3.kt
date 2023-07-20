package lesson4

const val IS_WEATHER_SUNNY = true
const val IS_TENT_OPEN = true
const val AIR_HUMIDITY = 20
const val NOT_CURRENT_SEASON = "winter"

fun main() {

    val isWeatherSunnyToday = true
    val isTentOpenToday = true
    val airHumidityToday = 20
    val currentSeasonToday = "winter"

    println("Благоприятные ли условия сейчас для роста бобовых? " +
            "${(isWeatherSunnyToday == IS_WEATHER_SUNNY)
                    && (isTentOpenToday == IS_TENT_OPEN)
                    && (airHumidityToday == AIR_HUMIDITY)
                    && (currentSeasonToday != NOT_CURRENT_SEASON)}")

}
