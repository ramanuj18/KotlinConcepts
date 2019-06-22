package com.example.kotlinconcepts.kotlinprogramming.collection.collectionexample


/*Kotlin collections are broadly categories into two different forms. These are:

1. Immutable Collection (or Collection)
2. Mutable Collection*/

fun main(args: Array<String>) {
var cityList=ArrayList<String>()
    cityList.add("Indore")
    cityList.add("Bhopal")

    println(cityList)

    var studentList= arrayListOf<String>()
    studentList.add("student1")
    studentList.add("student2")

    println(studentList)

    var productList= mutableListOf<String>("mouse","monitor")
    productList.add("mobile")
    productList.add("keyboard")
    productList.forEach { obj->
        println(obj)
    }
    println()

    var it=productList.iterator()
    while (it.hasNext()){
        println(it.next())
    }
    println()

    var subList=productList.subList(1,productList.size)
    println(subList)

    var index=productList.indexOf("mouse")
    println(index)

    println(productList.lastIndexOf("mouse"))
}