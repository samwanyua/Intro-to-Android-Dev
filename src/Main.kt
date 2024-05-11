fun main() {
    val languages = listOf("Kotlin","Python", "Java")
    val langCount = languages.count { currentString ->
        currentString.length >= 4
    }
    println(langCount)
}
// Extension function
fun <T>List<T>.customCount(function: (T) -> Boolean): Int{
    var counter = 0
    for (string in this){
        if(function(string)){
            counter ++
        }
    }
    return counter
}