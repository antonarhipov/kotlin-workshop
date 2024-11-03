package part1.basics

import kotlin.random.Random

fun main() {

    // if expression might return null value, hence the inferred type for 'text' is 'String?'
    val text = if(Random.nextBoolean()) "World" else null

//    println("Hello, ${text.uppercase()}!") // compilation error, need null-check or

    // use safe-call operator
    println("Hello, ${text?.uppercase()}!")

    //null check with smart cast
    if (text != null) {
        //smart cast: String? -> String
        val value = text.uppercase()
        println("Hello, $value!")
    }

    val nullableString : String? = null
    // !! means I know what I'm doing
    // this is made ugly on purpose
//    println(nullableString!!.length)

    val nullableString2 : String? = null

    // notNull doesn't accept null values
    fun strLength(notNull: String): Int {
        return notNull.length
    }
    // nullableString2 needs a null check
//    strLength(nullableString2)

    // The 'Elvis' operator, ?:
    val value : Int = nullableString2?.length ?: 0
    println(value)




}