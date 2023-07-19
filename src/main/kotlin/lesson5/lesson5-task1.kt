package lesson5

const val EXAMPLE = "2 + 2 = "
const val ANSWER_TO_EXAMPLE = 4

fun main() {

    print("Реши пример: $EXAMPLE")
    val userResponse = readln().toInt()
    if (userResponse == ANSWER_TO_EXAMPLE)
    {
        println("Добро пожаловать!")
    }
    else
    {
        println("Доступ запрещён.")
    }

}