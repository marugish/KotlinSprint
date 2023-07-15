package lesson1

fun correctTimeFormat(value: Int):String {
    var str: String = ""
    if (value in 0 .. 9) str += "0"
    str += value.toString()
    return str
}

fun main() {

    var seconds = 6480
    val hours = seconds / 3600
    seconds %= 3600
    val minutes = seconds / 60
    seconds %= 60
    // version 1
    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
    // version 2
    println("${correctTimeFormat(hours)}:${correctTimeFormat(minutes)}:${correctTimeFormat(seconds)}")

}