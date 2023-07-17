package lesson3

fun main() {

    var moveFrom = "E2"
    var moveTo = "E4"
    var moveNumber = 0
    var strOfMove = "[$moveFrom-$moveTo;$moveNumber]"
    println(strOfMove)
    moveNumber++
    moveFrom = "D2"
    moveTo = "D3"
    strOfMove = "[$moveFrom-$moveTo;$moveNumber]"
    println(strOfMove)

}