package com.example.kotlinconcepts.kotlinprogramming.collection.mixexample

fun mutableMap1(){

    var mapList=HashMap<Int,String>()
    mapList.put(1,"rama")
    mapList.put(2,"anuj")

    println(mapList)

    for(it in mapList.values){
        println(it)
    }
}

fun hashMapOf1(){
    var hashMap= hashMapOf<Int,Int>()
    hashMap.put(1,1)
    hashMap.put(3,5)
    hashMap.put(4,6)

    println(hashMap)
}

fun mutableMapOf1(){

    var mutableMap= mutableMapOf<Int,String>()

    mutableMap.put(1,"Rama")
    mutableMap.put(2,"Anuj")

    println(mutableMap)
}

fun main(args: Array<String>) {
    //mutableMap1()
    //hashMapOf1()
    mutableMapOf1()
}