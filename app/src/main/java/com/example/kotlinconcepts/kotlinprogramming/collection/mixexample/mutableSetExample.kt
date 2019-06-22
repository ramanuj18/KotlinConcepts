package com.example.kotlinconcepts.kotlinprogramming.collection.mixexample

fun setExample(){
    var set= setOf(3,"rama",45,67.4,"rama",45)
    println(set)

    var set1= mutableSetOf<Any>(3,4,5,5,5,"raman")
    println(set1)
}

fun setExample2(){
    var set= mutableSetOf<Int>(7,8,90)
    set.add(67)
    println(set.reversed())     //reversed() returns collection object but can't update existing collection object.
}

fun main(args: Array<String>) {
        setExample()
        setExample2()
}


