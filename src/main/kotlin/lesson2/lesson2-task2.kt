package lesson2

fun main() {

    val numberOfWorkers = 50
    val salaryOfWorkers = 30_000
    val numberOfTrainees = 30
    val salaryOfTrainees = 20_000

    val salaryForAllWorkers = numberOfWorkers * salaryOfWorkers
    val salaryForAllTrainees = numberOfTrainees * salaryOfTrainees
    val totalSalary = salaryForAllWorkers + salaryForAllTrainees
    val averageSalary = totalSalary / (numberOfWorkers + numberOfTrainees)

    println(salaryForAllWorkers)
    println(totalSalary)
    println(averageSalary)

}