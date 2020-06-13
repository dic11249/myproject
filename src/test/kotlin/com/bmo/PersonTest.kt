package com.bmo.kotlin

import com.bmo.Human
import com.bmo.Person
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PersonTest {
    @Test
    fun bmiTest() {
        val human = Human(66.5f, 1.7f)
        Assertions.assertEquals(66.5f/(1.7f*1.7f), human.bmi())
    }

    @Test
    fun personTest() {
        val person = Person(66.5f,1.7f)
        Assertions.assertEquals(66.5f/(1.7f*1.7f), person.bmi())
    }
}