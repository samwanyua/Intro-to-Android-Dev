fun main() {
    println(printNumbers())
    val x = checkIfEven(0)
    println(x)

    val y = 3
    println(y.checkIfOdd())
}
//extension function
fun Int.checkIfOdd(): Boolean{
    return this % 2 == 1
}

fun checkIfEven(number: Int = 543): Boolean{ // using default params, boolean is the return type
    return number % 2 == 0
}

fun printNumbers(){
    for (i in 1..10){
        println(i)
    }
}