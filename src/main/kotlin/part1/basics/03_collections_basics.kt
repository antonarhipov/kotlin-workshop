package part1.basics

// When programming, it is useful to be able to group data into structures for later processing.
// Kotlin provides collections for exactly this purpose.
// Kotlin has the following collections for grouping items: lists, sets, maps
// Each collection type can be _mutable_ or read only, e.g. List <-> MutableList

fun main() {
    lists()
    sets()
    maps()
}

private fun lists() {
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes)

    val shapes = mutableListOf("triangle", "square", "circle")
    println(shapes)

    shapes.add("pentagon") // adds "pentagon"

    val shapesLocked: List<String> = shapes
    println(shapesLocked)

    // no 'add' method
    // shapesLocked.add("hexagon")

    // lists are ordered, thus the elements can be accessed using indexes
    println(shapes[0])
    println(shapes.get(1))

    // can access the first and last elements using the corresponding functions
    println(shapes.first())
    println(shapes.last())

    // aggregate functions
    println(shapes.sumOf { it.length })
    println(shapes.count())

    //'in' operator
    println("circle" in shapes)
    println("star" in shapes)

    //iterate using in operator
    for (shape in shapes) {
        println(shape)
    }
}

private fun sets() {
    // Read-only set
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")

    // Mutable set with explicit type declaration
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")

    println(readOnlyFruit)

    //sets are unordered, this we can access the elements using indices
    // println(fruit[0])

    //'in' operator
    println("banana" in readOnlyFruit)

    //aggregate functions
    println(readOnlyFruit.maxByOrNull { it.length })
    println("This set has ${readOnlyFruit.count()} items")

}

private fun maps() {
    // Read-only map
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu)
    // {apple=100, kiwi=190, orange=100}

    // Mutable map with explicit type declaration
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(juiceMenu)
    // {apple=100, kiwi=190, orange=100}

    // same pattern as with lists and sets
    val juiceMenuLocked: Map<String, Int> = juiceMenu

    // access by value
    println("The value of pineapple juice is: ${readOnlyJuiceMenu["pineapple"]}")

    // add new pair
    juiceMenu["coconut"] = 150 // Add key "coconut" with value 150 to the map
    println(juiceMenu)

    // remove apple
    juiceMenu.remove("apple")
    println(juiceMenu)

    //in operator
    println("orange" in readOnlyJuiceMenu.keys) // true

    // Alternatively, you don't need to use the keys property
    println("orange" in readOnlyJuiceMenu) // true

    println(200 in readOnlyJuiceMenu.values) // false


}
