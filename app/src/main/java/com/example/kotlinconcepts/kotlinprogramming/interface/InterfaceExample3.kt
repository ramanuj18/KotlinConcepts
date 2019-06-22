package com.example.kotlinconcepts.kotlinprogramming.`interface`

interface A{
    fun show(){
        println("called show from interface A")
    }
}
interface B{
    fun show(){
        println("called show from interface B")
    }
}

class C:A,B{
    override fun show() {
        super<A>.show()
        println("called show from class C")
    }
}

fun main(args: Array<String>) {
    var c=C()
    c.show()
}