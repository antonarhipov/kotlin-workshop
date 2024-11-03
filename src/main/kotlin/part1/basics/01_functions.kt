package part1.basics

fun main() {
    val text = "World"
    simpleFunction(text)

    val result = simpleFunctionWithReturn(text)
    println("2. $result")

    val result2 = simpleFunctionWithExpressionBody(text)
    println("3. $result2")

    val result3 = simpleFunctionWithExpressionBodyAndTypeInference(text)
    println("4. $result3")

    functionWithDefaultParameter() // no parameter -> default value

    functionWithVararg("Foo", "Bar", "Baz")
    functionWithVarargAndDefaultParameter("Foo", "Bar", "Baz")
    functionWithVarargAndDefaultParameter(text = "FooBarBaz") // named parameter usage

    functionWithLambda(text, { it.uppercase() })

    functionWithLambda(text) {// trailing lambda as parameter
        it.uppercase()
    }

}

fun simpleFunction(text: String) {
    println("1. Hello, $text!")
}

fun simpleFunctionWithReturn(text: String): String {
    return "Hello, $text!"
}

fun simpleFunctionWithExpressionBody(text: String): String = "Hello, $text!"

fun simpleFunctionWithExpressionBodyAndTypeInference(text: String) = "Hello, $text!"

fun functionWithDefaultParameter(text: String = "World") {
    println("5. Hello, $text!")
}

fun functionWithVararg(vararg texts: String) {
    println("6. Hello, ${texts.joinToString()}!")
}

fun functionWithVarargAndDefaultParameter(vararg texts: String, text: String = "World") {
    println("7. Hello, ${texts.joinToString()} and $text!")
}

// function that takes functional type as a parameter
fun functionWithLambda(text: String, block: (String) -> String) {
    println("8. Hello, ${block(text)}!")
}

