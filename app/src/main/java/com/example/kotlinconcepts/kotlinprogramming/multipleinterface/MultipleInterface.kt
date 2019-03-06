package com.example.kotlinconcepts.kotlinprogramming.multipleinterface

interface A{
    fun display()
    fun callMe(){
        println("called from A")
    }
}
interface B{
    fun callMe(){
        println("called from B")
    }
}
class ImplementedClass: A,B{
    override fun display() {
        println("called display() from Implemented class")
    }

    override fun callMe() {
        super<A>.callMe()
        super<B>.callMe()
        println("callMe from Implemented Class")
    }
}

fun main(args: Array<String>) {
        val obj=ImplementedClass()
    obj.callMe()
    obj.display()
}