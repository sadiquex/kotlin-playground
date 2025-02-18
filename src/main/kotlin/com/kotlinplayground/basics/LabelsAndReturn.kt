package org.example.com.kotlinplayground.basics

fun main() {
    for (i in 1..5) {
//        println("i is: $i")
        if (i == 3) break
    }
    label()

//    println("End of program")

}

fun label() {
    loop@ for (i in 1..5) {
        println("i in label: $i")
//        if (i == 3) break@loop
        innerLoop@ for (j in 1..5) {
            println("j in $i")
            if (j == 2) break@innerLoop
        }
    }
}
