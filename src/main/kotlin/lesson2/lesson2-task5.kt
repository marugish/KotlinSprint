package lesson2

import kotlin.math.pow

fun main() {

    // A = P × (1 + r/n)^nt
    val initialAmount = 70_000      // P
    val interestRate = 0.167        // r
    val numberPeriodsInYear = 1     // n
    val termPerYears = 20           // t

    val intermediateResults = 1 + (interestRate / numberPeriodsInYear)
    val finalAmount = initialAmount * intermediateResults.pow(numberPeriodsInYear * termPerYears)

    println("%.3f".format(finalAmount))

}