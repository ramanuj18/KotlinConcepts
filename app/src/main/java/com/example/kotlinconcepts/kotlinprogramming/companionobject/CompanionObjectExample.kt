package com.example.kotlinconcepts.kotlinprogramming.companionobject

class Person{
     companion object Test{
         fun show()=
            println("show called form Person Companion Object")
     }
}
fun main(args: Array<String>) {
    Person.show()
}