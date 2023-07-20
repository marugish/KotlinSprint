package lesson5

const val USER_1 = "Zaphod"
const val USER_1_PASSWORD = "PanGalactic"

fun main() {

    print("Добро пожаловать на борт корабля \"Heart of Gold\"!\nВведите имя пользователя: ")
    val user = readln()

    if (user == USER_1) {
        print("Введите пароль: ")
        val userPassword = readln()
        if (userPassword == USER_1_PASSWORD)
            println("Добро пожаловать, $USER_1!")
        else
            println("Пароль неверный. Попробуйте ещё раз позже.")
    } else println("Не хотите ли зарегистироваться в системе?")

}