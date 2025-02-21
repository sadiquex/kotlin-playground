package org.example.com.kotlinplayground.classes

//object keyword for creating instances of a class
//Module 6, vid. 10
object Authenticate {

    fun authenticate(userName: String, password: String) {
        println("User authenticated for $userName")
    }

}

fun main() {
    Authenticate.authenticate("Saddik", "abc123")
}