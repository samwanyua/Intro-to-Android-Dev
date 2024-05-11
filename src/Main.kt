fun main() {
//    val dog = Animal("dog")
//    val dog = Dog()
//    dog.bark()

//    val cat = Cat()
//    cat.sound()
//    anonymous classes
    val bear = object : Animal("PolarBear"){
        override fun makeSound() {
            println("Roooaaaaaaar!!")
        }
    }

//    Try and catch
    val number = readlnOrNull() ?: "0"
    val parsedNum = try {
        number.toInt()
    } catch (e: Exception){
        0
    }
    println(parsedNum)



}