package com.example.kotlinconcepts.kotlinprogramming.collection.collectionexample

fun main(args: Array<String>) {
    var list= arrayListOf<Any>(4,6,"hello",90.0,89,9f,true,"hello",false)

    var it=list.iterator()

    while (it.hasNext()){
        val obj:Any=it.next()
        when (obj) {
            is Int -> println("$obj is Integer")
            is String -> println("$obj is String")
            is Float -> println("$obj is Float")
            is Boolean -> println("$obj is Boolean")
            is Double -> println("$obj is Double")
            else -> println("$obj not valid type")
        }
    }
}