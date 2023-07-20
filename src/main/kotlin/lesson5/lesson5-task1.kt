package lesson5

const val NUMBER_1 = 2
const val NUMBER_2 = 3
const val ANSWER_TO_EXAMPLE = NUMBER_1 + NUMBER_2

fun main() {

    print("Реши пример: $NUMBER_1 + $NUMBER_2 = ")
    val userResponse = readln().toInt()

    if (userResponse == ANSWER_TO_EXAMPLE)
        println("Добро пожаловать!")
    else
        println("Доступ запрещён.")

}