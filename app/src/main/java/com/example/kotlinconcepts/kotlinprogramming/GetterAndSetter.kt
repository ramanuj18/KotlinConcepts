package com.example.kotlinconcepts.kotlinprogramming

class Person(var _name:String){
    private var name:String=_name
//        get() {
//            return field
//        }
//      set(value) {
//        field=value
//    }

    fun getName():String{
        return name
    }
}

fun main(args: Array<String>) {
    var person=Person("hello")
    println(person.getName())

//    person.name="ramanuj"
//    println(person.name)
}