package lesson2

import kotlin.math.pow
import kotlin.math.roundToInt

fun main() {

    // A = P × (1 + r/n)^nt
    val initialAmount = 70_000      // P
    val interestRate = 0.167        // r
    val numberPeriodsInYear = 1     // n
    val termPerYears = 20           // t

    val intermediateResults = 1 + (interestRate / numberPeriodsInYear)
    val finalAmount = initialAmount * intermediateResults.pow(numberPeriodsInYear * termPerYears)
    val roundedFinalAmount = (finalAmount * 1000.0).roundToInt() / 1000.0   // 3 decimal places

    println(roundedFinalAmount)

}