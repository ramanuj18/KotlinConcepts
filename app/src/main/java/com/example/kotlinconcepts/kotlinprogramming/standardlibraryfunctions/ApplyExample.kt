package com.example.kotlinconcepts.kotlinprogramming.standardlibraryfunctions
//Kotlin apply is an extension function on a type. It runs on the object reference (also known as receiver)
// into the expression and returns the object reference on completion.
fun main(args: Array<String>) {
    data class Person(var name: String, var tutorial : String)
    var person = Person("Anupam", "Kotlin")

    var per= person.apply {this.tutorial="Android" }  //returns the object reference on completion
    println(per)

    //we can
    println(person)

    //apply vs also
    data class Person1(var n: String, var t : String)
    var person1= Person1("Anupam", "Kotlin")
    println(person1)
    person1.apply { t = "Swift" }
    println(person1)

    person1.also { it.t = "Kotlin" }
    println(person1)
}