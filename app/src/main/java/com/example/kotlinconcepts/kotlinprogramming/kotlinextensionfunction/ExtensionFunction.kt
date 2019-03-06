package com.example.kotlinconcepts.kotlinprogramming.kotlinextensionfunction

class Person{

    //You can only create an extension function of a public class
    fun show(){
        println("show called from person")
    }
    fun display(){
        println("display called from person")
    }
}

fun Person.disp(){              // we can also use extension Function for Builtin classes
    println("disp called from outside of Person")
    this.display()
}

fun main(args: Array<String>) {
    var person=Person()
    person.show()
    person.display()
    person.disp()
}
