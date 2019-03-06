package com.example.kotlinconcepts.kotlinprogramming.collection.mixexample

fun main(args: Array<String>) {

    var list= listOf(3,"40",78.0,"ramanuj")

    var stringList= listOf("aa","bb","cc","dd")

    var mapList= mapOf<Int,Int>(5 to 5,6 to 5)


    for (i in list){
        println(i)
    }
    println()

    for(index in 0 until stringList.size){
        println(stringList[index])
    }

    for (it in mapList){
        println(it)
    }

    //println(list.last())
}