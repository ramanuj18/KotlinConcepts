package com.example.kotlinconcepts.kotlinprogramming.breakcontinuejump

//labeled loop
fun main(args: Array<String>) {

    loop@ for(count1 in 1..10){

        for(count2 in 1..5){
            if (count2==3)
                break@loop
            println("count $count2")
        }
    }
    println("loop done")
}