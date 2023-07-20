package lesson4

const val HAND_EXERCISE = true
const val LEG_EXERCISE = false
const val BACK_EXERCISE = false
const val PRESS_EXERCISE = true

fun main() {

    val trainingDay = 5
    val flag = ((trainingDay % 2) == 0)

    val multiString = """
        Упражнения для рук:    ${(flag && !HAND_EXERCISE) || (!flag && HAND_EXERCISE)}
        Упражнения для ног:    ${(flag && !LEG_EXERCISE) || (!flag && LEG_EXERCISE)}
        Упражнения для спины:  ${(flag && !BACK_EXERCISE) || (!flag && BACK_EXERCISE)}
        Упражнения для пресса: ${(flag && !PRESS_EXERCISE) || (!flag && PRESS_EXERCISE)}
    """.trimIndent()

    println(multiString)

}