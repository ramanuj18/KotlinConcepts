package com.example.kotlinconcepts.kotlinprogramming.flowcontrol

fun main(args: Array<String>) {
  var age=0
    var result:String
    when{
        age>0->result="positive number"
        age<0->result="negative number"
        else->result="number is zero"
    }
    println(result)

    val a = 10
    when (a) {
        in 1..10 -> println("A positive number less than 11.")
        in 11..100 -> println("A positive number between 10 and 100")
    }
}