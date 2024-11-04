package part1.basics

import kotlin.random.Random

// In Kotlin, 'if', 'try', 'when' are expressions and can return values
// The if-expression is a replacement to a ternary operator

fun main() {
    val randomNumber = Random.nextInt(10)
    ifExpression(randomNumber).also(::println)
    ifExpression2(randomNumber).also(::println)

    tryExpression(randomNumber).also(::println)

    whenExpression()
}

//region Expressions
private fun ifExpression(random: Int): String {
    val result = if (random > 5) {
        "random is greater than 5: $random"
    } else {
        "random is smaller than 5: $random"
    }
    return result
}

private fun ifExpression2(random: Int) = if (random > 5) {
    "random is greater than 5: $random"
} else {
    "random is smaller than 5: $random"
}

fun tryExpression(random: Int): String {
    return try {
        if (random > 5) error("random is greater than 5: $random")
        "result"
    } catch (e: Exception) {
        "error"
    }
}

fun whenExpression(random: Int = Random.nextInt(10)) {
    when {
        random > 5 -> println("random is greater than 5: $random")
        random < 5 -> println("random is smaller than 5: $random")
        else -> println("random is 5")
    }

    when {
        random in 1..3 -> println("random is greater than 0 and smaller than 3")
        random in 7..10 -> println("random is greater than 7 and smaller than 11")
        else -> println("random is greater than 3 and smaller than 7")
    }

    when (random) {
        1 -> println("random is 1")
        2 -> println("random is 2")
        else -> println("random is neither 1 nor 2")
    }
}
//endregion

//region Loops
// NB! Looping/iteration is O.K
// But as soon as you need to mutate state or calculate something, consider standard library alternatives
fun loops(list: List<String>){
    for (item in list) {
        println(item)
    }

    for (index in list.indices) {
        println(list[index])
    }

    for ((index, item) in list.withIndex()) { // destructuring!!!
        println("item at index $index is $item")
    }

    // iterating over ranges

    for (i in 1..10) println(i)

    for (i in 1..10 step 2) println(i)

    for (i in 10 downTo 1) println(i)

    // rangeUntil operator
    for (i in 1 until 10) println(i)
    for (i in 1 ..< 10) println(i)
}
//endregion