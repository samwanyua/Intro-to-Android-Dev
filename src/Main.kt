// Global variables
val role: String = "Mobile Developer";

var greeting: String = "Hello"

fun main() {
    //    Variables
//    mutable variables - can be reassigned
//    Read only variables - can't be assigned
    println("Hello, just started Kotlin!")
    println(greeting)

    greeting = "Hi"

    println(greeting)

//    nullable string
    val parentName: String? = null

    println(parentName)




    val userName: String = "johnSam"; // can't be reassigned

    var profileStatus: String = "Qualified"; // can be reassigned
    profileStatus = "Excellent";

    println(profileStatus);
    println(role)




}
