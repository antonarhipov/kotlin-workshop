package part1.basics

interface SomeInterface {
    fun someFunction()
}

class SomeClass(val text: String) : SomeInterface {
    fun someSimpleFunction(){}
    override fun someFunction() {}
}

// extending not allowed by default
class SomeOtherClass // : SomeClass

// class hierarchy should be designed for subclassing
open class BaseClass {
    open fun baseFunction1(){}  // functions should be open for overriding
    fun baseFunction2(){}
}

class DerivedClass() : BaseClass() { // calling the super constructor

    var text: String = "Text"  // don't do this

    constructor(text: String) : this() {// secondary constructor
        this.text = text
    }

    override fun baseFunction1() {}
    // overriding baseFunction2 is not allowed
    // override fun baseFunction2() {}
}