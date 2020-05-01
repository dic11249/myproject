package com.bmo

import javafx.scene.text.FontWeight

fun main() {
//    println("Hello Kotlin");
//    Human().hello();
    val h = Human(66.5f, 1.7f);
    println(h.bmi());
    /*val age : Int = 19;
    var weight = 66.5f;
    val name : String;
    name = "Bmo";*/
}

class Human(var weight: Float, var height : Float) {
    fun bmi() : Float {
        val bmi = weight / (height*height);
        return bmi;
    }

    fun hello(){
        println("Hello Kotlin");
    }
}