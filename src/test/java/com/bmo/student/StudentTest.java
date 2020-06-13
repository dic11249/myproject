package com.bmo.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {

    @Test
    void highScoreTest(){
        Student student = new Student("Bmo",80,60);
        Assertions.assertEquals(80, student.highest());
    }

    @Test
    void averageTest() {
        Student student = new Student("Bmo",80,60);
        Assertions.assertEquals((80+60)/2, student.getAverage());
    }
}
