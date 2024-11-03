package part1.basics

data class User(val name: String, val age: Int)

fun main() {
    val user = User("Peter", 31)
    println(user)
}
