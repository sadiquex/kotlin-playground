package org.example.com.kotlinplayground.classes

// A class is a blueprint for an object
// An object is an instance of a class

// 1. basic classes
class Person {
    fun action() {
//        println("Person walks")
    }
}

// 2. Primary constructors
class PrimaryConstructor(val name: String, val age: Int) {
    fun greet() {
        println("Hello $name, are you $age years old?")
    }
}

// 3. Secondary constructors
class SecondaryConstructor() {
    var name: String = "" // we will re-initialize 'name' using the secondary constructor

    constructor(_name: String) : this() { // we need to make a call to the primary constructor using this()
        name = _name
    }


}

fun main() {
    val person = Person()
    person.action()

    val greetPerson = PrimaryConstructor("Saddik", 8)
//    greetPerson.greet()

    val secondaryConst = SecondaryConstructor(_name = "Pearl")
    println("Her name is ${secondaryConst.name}")

}

