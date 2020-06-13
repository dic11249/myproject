package com.bmo

import java.util.*

fun main() {
    val secret = Random().nextInt(10) + 1
    println(secret)
    val scanner = Scanner(System.`in`)
    for(i in 1..5) {
        print("Please a number (${i}/5 : ")
        var number = scanner.nextInt()
        println("第${i}次 $number")
        if(number > secret) {
            println("Lower")
        } else if(number < secret) {
            println("Higher")
        } else {
            println("bingo number is $secret")
            break
        }
    }
}