package lesson2

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

    println(String.format("%02d:%02d", arrivalHour, arrivalMinute))

}