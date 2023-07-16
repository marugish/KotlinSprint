package lesson1

fun correctTimeFormat(value: Int):String {
    var str: String = ""
    if (value in 0 .. 9) str += "0"
    str += value.toString()
    return str
}

fun main() {

    val flightTime = 6480
    val hours = flightTime / 3600
    val minutes = (flightTime % 3600) / 60
    val seconds = flightTime % 60
    // version 1
    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
    // version 2
    println("${correctTimeFormat(hours)}:${correctTimeFormat(minutes)}:${correctTimeFormat(seconds)}")

}