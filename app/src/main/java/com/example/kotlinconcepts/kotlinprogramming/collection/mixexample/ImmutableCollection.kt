package com.example.kotlinconcepts.kotlinprogramming.collection.mixexample

import java.util.function.Consumer

fun immutableList(){
    var listOfName= listOf<String>("rakesh","ramesh","suresh")      //using listOf<>()

    var listOfObjects= listOf(4,"ram",10)       //using listOf()

    /*for (it in listOfName.asReversed()){
        println(it)
    }*/

    for(it in listOfName){
        println(it)
    }

    println(listOfName.indexOf("rakesh"))

    println(listOfObjects)

    var iterator=listOfName.iterator()
    while (iterator.hasNext()){
        println(iterator.next())
    }
}

fun immutableMap(){

    var map= mapOf("ram" to 1,"shyam" to 2 ,"mohan" to 3)

    for (it in map){
        println("${it.key} ${it.value}")
    }
}

fun immutableSet(){

    var set= setOf<Int>(3,2,2,9,7,4)

    println(set)
}

fun main(args: Array<String>) {

    immutableList()
    immutableMap()
    immutableSet()
}