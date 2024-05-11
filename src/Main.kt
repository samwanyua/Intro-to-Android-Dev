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

}