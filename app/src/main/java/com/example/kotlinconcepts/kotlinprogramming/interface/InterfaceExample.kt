package com.example.kotlinconcepts.kotlinprogramming.`interface`

interface MyInterface{
    val age:Int

    fun foo():String

    fun hello(){
        println("hello from interface")
    }
}
class Example:MyInterface {
    override val age: Int =45

    override fun foo(): String {
       return "foo form Example"
    }

  /*  override fun hello() {
        super.hello()
        println("hello from Example ")
    }*/
}

fun main(args: Array<String>) {
    val example=Example()
    println("my age is ${example.age}")
    println(example.foo())
    example.hello()
}