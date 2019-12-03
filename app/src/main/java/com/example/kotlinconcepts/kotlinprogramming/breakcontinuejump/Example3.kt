package com.example.kotlinconcepts.kotlinprogramming.breakcontinuejump


fun main(args: Array<String>) {

    //continue example with loop
    test@ for(i in 1..10){
        for(j in 1..5){
            if(i==3){
                continue@test
            }
            print("$i of $j \n")
        }
    }

    //break example with loop
    /*loop@ for(i in 1..10){
        for(j in 1..5){
            if(i==3){
                break@loop
            }
            print("$i of $j \n")
        }
    }*/

}