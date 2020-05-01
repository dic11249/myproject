package com.bmo.kotlin

import java.util.*

fun main() {
//    userInput();
    val stu = Student("Bmo", 88, 50);
    stu.print();
    println("High score: ${stu.highest()}");
}

class Student(var name:String, var english:Int, var math:Int) {
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

    fun passOrFailed() = if(getAverage() >= 60) "Pass" else "failed";

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

