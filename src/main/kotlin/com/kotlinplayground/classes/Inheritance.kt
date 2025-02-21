package org.example.com.kotlinplayground.classes

open class User(val name: String) {

}

class Student(name: String) : User(name)

class Student2(name: String) : User(name) {
    companion object {
        //        we need to add 'const' when setting a variable in a companion object
        val course = "Engineering"

        fun country() = "GHANA"
    }
}

class Instructor(name: String) : User(name)

fun main() {
    val student = Student("Saddik")
    println("Student name is: ${student.name}")

    val instructor = Instructor("Jonathan")
    println("Instructor name is: ${instructor.name}")

//    using a companion class
    val student2Country = Student2.country()
    println("Country is $student2Country")
    println("Course is ${Student2.course}")


}