package com.example.kotlinconcepts.kotlinprogramming.standardlibraryfunctions

//As the name says, also expressions does some additional processing on the object it was invoked.
//Unlike let, it returns the original object instead of any new return data. Hence the return data has always the same type.
//Like let, also uses it too.

fun main(args: Array<String>) {

    var a=5
    a.also { it+10 }.also { it+20 }
    println(a)          //return original object

    var a1=5
    a1.also { val n=it+50
        println(n) }.also { println(it) }
    println(a1)             //"also always return original object"

    data class Person1(var name: String, var tutorial : String)
    var person1= Person1("Anupam", "Kotlin")

    person1.also { obj->obj.name}           //return original object

}