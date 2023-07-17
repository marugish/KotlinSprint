package lesson1

fun main() {

    val flightTime = 6480
    val hours = flightTime / 3600
    val minutes = (flightTime % 3600) / 60
    val seconds = flightTime % 60

    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))

}