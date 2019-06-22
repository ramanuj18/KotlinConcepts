package com.example.kotlinconcepts.kotlinprogramming.standardlibraryfunctions

fun main(args: Array<String>) {
    data class Person(var name: String, var tutorial : String)
    var person = Person("Anupam", "Kotlin")

    val tut=with(person){
        tutorial="Android"
        name="ramanuj"
        tutorial        //last statement return as result
    }
    println(person)
    println(tut)
}