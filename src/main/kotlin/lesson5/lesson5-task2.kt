package lesson5

const val AGE_OF_MAJORITY = 18
const val YEAR = 2023

fun main() {

    print("Введите год вашего рождения: ")
    val userYear = readln().toInt()
    val userAge = YEAR - userYear

    if (userAge >= AGE_OF_MAJORITY)
        println("Показать экран со скрытым контентом")
    else
        println("Вернуться на главный экран приложения")

}