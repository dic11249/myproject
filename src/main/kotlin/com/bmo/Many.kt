package com.bmo

fun main() {
    val list = listOf(5, 1, 2, 7);
    println(list)
    val scores = listOf(66, 88, 77, 99, 50);
    for (score in scores) {
        println(score)
    }
    println(list.get(3))
    var mutableList = mutableListOf(5, 1 , 2 ,7);
    mutableList.add(6)
    println(mutableList)
}