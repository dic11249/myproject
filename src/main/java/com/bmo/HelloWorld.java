package com.bmo;

public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello");
        Person p = new Person();
        p.hello();
        p.weight = 66.5f;
        p.height = 1.7f;
        System.out.println(p.bmi());
        /*int age = 19;
        Integer age2 = 19;
        char c = 'A';
        Character c2 = 'A';
        byte b = 120;
        float weight = 66.5f;
        double height = 1.7;
        boolean adult = true;
        boolean enroll = false;
        String name = "Bmo";*/
    }
}
