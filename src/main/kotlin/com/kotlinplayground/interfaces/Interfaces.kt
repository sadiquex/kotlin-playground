package org.example.com.kotlinplayground.interfaces

import com.kotlinplayground.classes.Course

interface CourseRepository {

    fun getById(id: Int): Course

}

//implementation class
class SqlCourseRepository : CourseRepository {
    override fun getById(id: Int): Course {
        return Course(
            id,
            "Reactive Programming in Modern Java using Project Reactor",
            "Dilip"
        )
    }

}


fun main() {

    val sqlCourseRepository = SqlCourseRepository()
    val course = sqlCourseRepository.getById(1)
    println("Course is $course")
}