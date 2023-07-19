package lesson2

fun main() {

    val checkoutHour = 9
    val checkoutMinute = 39
    val travelTimeInMinute = 457

    val minutesInHourConst = 60
    val hoursInDayConst = 24

    // Переводим 9:39 в минуты от начала дня
    var minutesFromDayStart = checkoutHour * minutesInHourConst + checkoutMinute
    // Прибавляем время в пути
    minutesFromDayStart += travelTimeInMinute
    // Переводим обратно в часы:минуты
    var arrivalHour = minutesFromDayStart / minutesInHourConst
    val arrivalMinute = minutesFromDayStart % minutesInHourConst
    if (arrivalHour >= hoursInDayConst) arrivalHour %= hoursInDayConst

    println(String.format("%02d:%02d", arrivalHour, arrivalMinute))

}