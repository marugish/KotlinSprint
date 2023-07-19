package lesson5

const val NUMBER_1 = 22
const val NUMBER_2 = 33
fun main() {

    print("Введите первое число: ")
    val number1 = readln().toInt()
    print("Введите второе число: ")
    val number2 = readln().toInt()

    if (number1 == NUMBER_1 && number2 == NUMBER_2)
    {
        println("Поздравляем! Вы выиграли главный приз!")
    }
    else if (number1 == NUMBER_1 || number2 == NUMBER_2)
    {
        println("Вы выиграли утешительный приз!")
    }
    else
    {
        println("Неудача! Крутите барабан!")
    }
    println("Числа необходимые для победы: $NUMBER_1 и $NUMBER_2.")

}