package org.example.com.kotlinplayground.basics

var position = 1

//if ... else statement
val medal = if (position == 1) {
    "GOLD"
} else if (position == 2) {
    "Silver"
} else {
    "No medal"
}

//if ... when statement
val medal2 = when (position) {
    1 -> "GOLD"
    2 -> "Silver"
    else -> "No medal"
}