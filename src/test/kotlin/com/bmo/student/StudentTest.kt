package com.bmo.student.kotlin

import com.bmo.kotlin.Student
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StudentTest {

    @Test
    fun highestTest() {
        val student = Student("bmo",80,60)
        Assertions.assertEquals(80, student.highest())
    }

    @Test
    fun averageTest() {
        val student = Student("bmo",80,60)
        Assertions.assertEquals((60+80)/2, student.getAverage())
    }

    @Test
    fun gradingTest() {
        val student = Student("bmo",80,60)
        Assertions.assertEquals('C', student.grading())
    }
}