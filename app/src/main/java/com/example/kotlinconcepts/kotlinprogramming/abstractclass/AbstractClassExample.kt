package com.example.kotlinconcepts.kotlinprogramming.abstractclass

abstract class Parent{
    val age:Int=40
    open fun display(name:String){
        println("name is $name from parent")
    }
    abstract fun add(a:Int,b:Int):Int
}

class Child:Parent(){
    override fun add(a: Int, b: Int): Int {
        return a+b
    }
    override fun display(name: String) {
        println("name is $name from child")
    }
}
fun main(args: Array<String>) {
    val child=Child()
    println(child.add(45,45))
    child.display("ramanuj")
    println("age is ${child.age}")

    var parent=object :Parent(){
        override fun add(a: Int, b: Int): Int {
            return a
        }
    }
    println("${parent.add(5,6)}")
}