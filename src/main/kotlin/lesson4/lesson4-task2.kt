package lesson4

const val AVERAGE_WEIGHT_LOWER_BOUND = 35
const val AVERAGE_WEIGHT_UPPER_BOUND = 100
const val AVERAGE_VOLUME_UPPER_BOUND = 100
fun main() {

    val weightCargo1 = 20
    val volumeCargo1 = 80
    val weightCargo2 = 50
    val volumeCargo2 = 100

    println("Груз с весом $weightCargo1 кг и объёмом $volumeCargo1 л соответствует категории 'Average': " +
            "${(weightCargo1 >= AVERAGE_WEIGHT_LOWER_BOUND) && (weightCargo1 <= AVERAGE_WEIGHT_UPPER_BOUND) && (volumeCargo1 < AVERAGE_VOLUME_UPPER_BOUND)}")
    println("Груз с весом $weightCargo2 кг и объёмом $volumeCargo2 л соответствует категории 'Average': " +
            "${(weightCargo2 >= AVERAGE_WEIGHT_LOWER_BOUND) && (weightCargo2 <= AVERAGE_WEIGHT_UPPER_BOUND) && (volumeCargo2 < AVERAGE_VOLUME_UPPER_BOUND)}")

}