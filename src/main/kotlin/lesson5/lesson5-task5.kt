package lesson5

import kotlin.random.Random

fun main() {

    val winningNumber1 = Random.nextInt(1, 5)
    val winningNumber2 = Random.nextInt(1, 5)

    print("$winningNumber1, $winningNumber2")
    print("Введите первое число: ")
    val number1 = readln().toInt()
    print("Введите второе число: ")
    val number2 = readln().toInt()

    var numberOfGuessed = 0
    when (number1) {
        winningNumber1 -> numberOfGuessed++
        winningNumber2 -> numberOfGuessed++
    }
    when (number2) {
        winningNumber1 -> numberOfGuessed++
        winningNumber2 -> numberOfGuessed++
    }
    when (numberOfGuessed) {
        2 -> println("Поздравляем! Вы выиграли главный приз!")
        1 -> println("Вы выиграли утешительный приз!")
        else -> println("Неудача! Крутите барабан!")
    }
    println("Числа необходимые для победы: $winningNumber1 и $winningNumber2.")

}