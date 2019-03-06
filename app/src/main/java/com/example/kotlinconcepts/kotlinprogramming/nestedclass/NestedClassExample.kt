package com.example.kotlinconcepts.kotlinprogramming.nestedclass

class Outer{
    private var name="Rama"
    inner class Nested{     //we can't be able to access outer class property until we add inner keyword in class declaration
        fun show()= println("show called from Nested class $name")
    }
}
fun main(args: Array<String>) {
    var nested=Outer().Nested()
    nested.show()
}

