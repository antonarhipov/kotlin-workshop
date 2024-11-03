package part1.basics

fun main() {
    println("H1e2l3l4o5!".filteredString())
    println("H1e2l3l4o5!".filteredString)
}

// extension function
fun String.filteredString(): String {
    // this implementation for demonstration purpose only
    // filter { it.isLetter() } is more idiomatic

    var result = ""
    for (c in this) {
        if (c.isLetter()) result += c
    }

    return result
}

// extension property
val String.filteredString: String
    get() = filter { it.isLetter() }


// functional literal with receiver
// this is useful for creating DSLs
val literal: String.() -> Unit = {
    println(this)
}