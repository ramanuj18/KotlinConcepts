package com.example.kotlinconcepts.kotlinprogramming.flowcontrol

fun main(args: Array<String>) {
    var age=18
    if(age<18){
        println("you can't vote")
    }else{
        println("you can vote")
    }

    //condition with inline statement
    val number=0
    val result=if(number>0)
        "positive number"
    else if(number>0)
        "negative number"
    else "zero"
    println(result)
}