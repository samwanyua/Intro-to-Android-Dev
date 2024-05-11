fun main() {
    println("I am back to Kotlin again!")

//    Variables
    var x: Int = 34; // 32 bit (2^32)
    println("The value of x is $x")
    x = 56;
    println("The value of x is $x")

//   Data Types
    val bigNumber = 324L // this is a long - 64 bit
    val doubleNumber = 32.234 // double - more precision
    val floatNumber = 23.343f // float
    val trueFalse = false // boolean
    val singleCharacter = 'a' //character

//    Arithmetic
    val xy = 3 * 4
    val e = 3f / 4f
    val u = 10 % 3
    println("The result is $xy")
    println("The result is $e")
    println("The result is $u")

//  Logic and comparison operator
    val adult = true
    val programmer = true
    val adultProgrammer = adult && programmer
    println(adultProgrammer) // true
    val eitherAdultProgrammer = adult || programmer
    println(eitherAdultProgrammer) // true

    val great = (adult == programmer)
    println(great)

    val there = (adult != programmer)
    println(there)

//    Strings
    val product = "Kotlin"
    println(product.toUpperCase())
    println(product.toLowerCase())

//    if conditions
    val xt = 1 + 1
    if (xt == 2){
        println("xt is 2")
    }
    else if(xt == 3){
        println("xt is 3")
    }
    else{
        println("xt is not 2 or 3")
    }

    val gfs = if(xt == 2) 2 else 3
    println(gfs)

//    Null values - null safety
//    Type is not nullable by default

   /* val r: Int? = null
    val num1 = readLine() ?: "0"
    val num2 = readLine() ?: "0"

    // Convert input strings to integers, using 0 as default if input is null or not a valid integer
    val intNum1 = num1.toIntOrNull() ?: 0
    val intNum2 = num2.toIntOrNull() ?: 0

    val res = intNum1 + intNum2
    println(res)

    */

//    List
//    This is an immutable list - you can't modify it
    val shoppingList = listOf<String>("Banana", "Apple", "Grapes")
    println(shoppingList[2])

//    Mutable list
    val cars = mutableListOf("BMW", "Ford","Volkswagen","Benz")
    cars.add("Jeep") // add an item

//   While loops
    var counter = 0
    while (counter < cars.size){
        println(cars[counter])
        counter ++
    }

//    For loop
    for (shoppingItem in shoppingList){
        println(shoppingItem)
    }

    for (i in 1..100){
        println(i)
    }

    val w = 31
    when(w){
        in 1..10 -> println("w is in the range of 1 to 10")
        in 11..20 -> println("w is in the range of 11 to 20")
        else -> {
            println("w is out of range")
        }
    }







}