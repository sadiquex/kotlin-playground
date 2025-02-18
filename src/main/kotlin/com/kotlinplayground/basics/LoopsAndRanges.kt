package org.example.com.kotlinplayground.basics

fun main() {

    val range = 1..10
//    for (num in range) {
//        println(num)
//    }

//    ranging downwards
    val reverseRange = 10 downTo 1
//    for (num in reverseRange step 2) {
//        println(num)
//    }

    exploreWhile()
    exploreDoWhile()

}


fun exploreDoWhile() {
    var i = 0

    do {
        println("Value of i is: $i")
        i++
    } while (i < 5)
}

fun exploreWhile() {
    var x = 1

    while (x < 5) {
//        println("Value of x is $x")
        x++
    }
}



