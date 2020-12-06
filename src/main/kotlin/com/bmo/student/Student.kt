package com.bmo.kotlin

import java.util.*

fun main() {
//    userInput();
    Student.pass = 50;
    val stu = Student("Bmo0", 88, 50);
    val stu1 = Student("Bmo1", 60, 50);
    val stu2 = Student("Bmo2", 20, 80);
    stu.print();
    stu1.print();
    stu2.print();
    println("High score: ${stu.highest()}");
}

class Student(var name:String, var english:Int, var math:Int) {
    companion object {
        @JvmStatic
        var pass = 60;
        fun test() {
            println("testing");
        }
    }

    fun print() {
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${grading()}");
    }

    fun grading() = when(getAverage()) {
        in 90..100 -> 'A';
        in 80..89 -> 'B';
        in 70..79 -> 'C';
        in 60..69 -> 'D';
        else -> 'F';
    }

    fun passOrFailed() = if(getAverage() >= pass) "Pass" else "failed";

    fun getAverage() =  (english+math)/2;

    fun highest() = if(english > math) {
        println("english is highest")
        english
    } else {
        println("math is highest")
        math
    };
}

private fun userInput() {
    val scanner = Scanner(System.`in`);
    print("Please enter name: ");
    var name = scanner.next();
    print("Please enter english: ");
    var english = scanner.nextInt();
    print("Please enter math: ");
    var math = scanner.nextInt();
}

