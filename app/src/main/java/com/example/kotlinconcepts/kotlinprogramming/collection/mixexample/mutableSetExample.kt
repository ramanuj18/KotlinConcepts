package com.example.kotlinconcepts.kotlinprogramming.collection.mixexample

fun setExample(){
    var set= setOf(3,"rama",45,67.4,"rama",45)
    println(set)

    var set1= mutableSetOf<Any>(3,4,5,5,5,"raman")
    println(set1)
}

fun main(args: Array<String>) {
        setExample()
}


