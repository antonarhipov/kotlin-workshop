package part3.dsl

import model.Client
import model.ClientBuilder


// let's build a DSL!
// https://kotlinlang.org/docs/type-safe-builders.html#type-safe-builders.md

// see java/model/Example.java
// Features to demo:
// * String interpolation
// * Extension functions
// * Extension properties
// * Lambdas
// * SAM conversion?
// * Functional literanl with receiver
// * Inline functions
// * Trailing lambda as a parameter
// * Named arguments?


fun main() {
    val builder = ClientBuilder()
}