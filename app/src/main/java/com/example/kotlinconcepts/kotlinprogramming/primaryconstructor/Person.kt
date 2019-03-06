package com.example.kotlinconcepts.kotlinprogramming.primaryconstructor

open class Person() {
   open var age:Int=0
    fun getAge(){
        println("my age is $age")
    }
}

fun main(args: Array<String>) {
    var  person=Person()
    person.age=30
    person.getAge()
}