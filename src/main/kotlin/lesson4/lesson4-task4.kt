package lesson4

const val HAND_EXERCISE = true
const val LEG_EXERCISE = false
const val BACK_EXERCISE = false
const val PRESS_EXERCISE = true

fun main() {

    val trainingDay = 5
    if ((trainingDay % 2) == 0)
    {
        val multiString = """
            Упражнения для рук:    ${!HAND_EXERCISE}
            Упражнения для ног:    ${!LEG_EXERCISE}
            Упражнения для спины:  ${!BACK_EXERCISE}
            Упражнения для пресса: ${!PRESS_EXERCISE}
        """.trimIndent()
        println(multiString)
    }
    else
    {
        val multiString = """
            Упражнения для рук:    ${HAND_EXERCISE}
            Упражнения для ног:    ${LEG_EXERCISE}
            Упражнения для спины:  ${BACK_EXERCISE}
            Упражнения для пресса: ${PRESS_EXERCISE}
        """.trimIndent()
        println(multiString)
    }

}