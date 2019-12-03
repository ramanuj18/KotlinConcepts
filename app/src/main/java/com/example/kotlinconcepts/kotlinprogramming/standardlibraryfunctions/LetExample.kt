package com.example.kotlinconcepts.kotlinprogramming.standardlibraryfunctions


//let takes the object it is invoked upon as the parameter and returns the result of the lambda expression.
fun main(args: Array<String>) {

    //example1
    var str="Hello World"
    str.let { println("$it") }

    //example2
    var str1="Hello Kotlin Let"
    str1.let {  println(it) }
    var strLength=str1.let { "$it function".length }        //let return result of lambda expression
    println("length is $strLength")

    //example3
    var a=1
    var b=2

    val c=a.let { it+2 }.let { it+b }
    println(c)

    //nested let
    //example4
    var name="Ramanuj"
    name.let { outer->outer.let { inner-> println("inner is $inner and outer is $outer") } }
    //let for null check
    var nm:String?="kotlin let null check"
    nm?.let { println(it) }
    nm=null
    nm?.let { println(it) }


    data class Person1(var name: String, var tutorial : String)
    var person1= Person1("Anupam", "Kotlin")

    person1.let { obj->obj.name="Anuj" }
    println(person1.name)
}