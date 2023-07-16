package lesson2

fun correctTimeFormat(value:Int):String {

    var str = ""
    if (value in 0 .. 9) str += "0"
    str += value.toString()
    return str

}

fun main() {

    val checkoutHour = 9
    val checkoutMinute = 39
    val travelTimeInMinute = 457

    var arrivalHour = checkoutHour + (travelTimeInMinute / 60)
    var arrivalMinute = checkoutMinute + (travelTimeInMinute % 60)
    if (arrivalMinute >= 60) {
        arrivalHour += 1
        arrivalMinute -= 60
    }
    if (arrivalHour >= 24) arrivalHour -= 24

    // version 1
    println(String.format("%02d:%02d", arrivalHour, arrivalMinute))
    // version 2
    println("${correctTimeFormat(arrivalHour)}:${correctTimeFormat(arrivalMinute)}")

}