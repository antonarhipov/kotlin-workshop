package part1.basics

data class User(val name: String, val age: Int)

fun main() {
    val user1 = User("Peter", 31)
    val user2 = User("Peter", 31)
    println(user1 == user2)

    val user3 = user1.copy(name = "John")
    println(user3)

    val (name, age) = user3
    println("$name, $age years of age")

    val map = mapOf(user1 to "one", user2 to "two", user3 to "three")
    println(map)
}

fun main2() {
    val user = User("Peter", 31)
    val (name, age) = user
    println("$name, $age years of age")

    var users = listOf(User("Peter", 31), User("John", 30), User("Mary", 25))
    users.forEach { (name, age) ->
        println("$name, $age years of age")
    }

    println("Users (${users.size}): $users")
    val (user1, user2, a, b, c/*, d*/) = users
    println("Extracted $user1")
    println("Extracted $user2")
}

//operator fun <T> List<T>.component6(): T {
//    return this[5]
//}
