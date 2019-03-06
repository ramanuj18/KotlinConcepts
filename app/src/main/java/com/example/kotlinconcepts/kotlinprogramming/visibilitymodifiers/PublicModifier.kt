package com.example.kotlinconcepts.kotlinprogramming.visibilitymodifiers

 class Abc{
     public fun show(){
         println("show() called from abc")
     }
 }

public class Person{
    fun display(){
        println("display() called from Parent")
    }
}

fun main(args: Array<String>) {
    val abc=Abc()
    abc.show()

    val person=Person()
    person.display()

}