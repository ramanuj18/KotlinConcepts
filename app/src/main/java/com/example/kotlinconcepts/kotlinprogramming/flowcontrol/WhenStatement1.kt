package com.example.kotlinconcepts.kotlinprogramming.flowcontrol

fun main(args: Array<String>) {
    var age=106

    when (age){
        101->println("age is 101")
        102->println("age is 102")
        103-> println("age is 103")
        else-> println("invalid age")
    }
    //example2
    var num=0
    var day=when(num){
        1->"Sunday"
        2->"Monday"
        3->"Tuesday"
        4->"Wednesday"
        5->"Thursday"
        6->"Friday"
        7->"saturday"
        else->"invalid input"
    }
    println(day)
}