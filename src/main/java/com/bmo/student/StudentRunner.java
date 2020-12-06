package com.bmo.student;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
//        userInput();
        com.bmo.kotlin.Student.getPass();
        Student.pass = 40;
        Student stu = new Student("Bmo", 77, 60);
        Student stu2 = new Student("Tom", 50, 40);
        Student stu3= new Student("AJi", 30, 55);
        stu.print();
        stu2.print();
        stu3.print();
        System.out.println("High score: " + stu.highest());
    }

    private static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter student's name:");
        String name = scanner.next();
        System.out.println("Please enter student's english:");
        int english = scanner.nextInt();
        System.out.println("Please enter student's math:");
        int math = scanner.nextInt();

    }
}
