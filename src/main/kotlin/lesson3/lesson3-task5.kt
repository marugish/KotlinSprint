package lesson3

fun main() {

    val strOfMove = "D2-D4;0"
    // Разбиваем строку по разделителям
    val partsOfMove = strOfMove.split("-", ";")
    // Получаем массив строк, обращаемся к элементам массива используя индексы (с 0)
    val moveFrom = partsOfMove[0]
    val moveTo = partsOfMove[1]
    val moveNumber = partsOfMove[2]

    println(moveFrom)
    println(moveTo)
    println(moveNumber)

}