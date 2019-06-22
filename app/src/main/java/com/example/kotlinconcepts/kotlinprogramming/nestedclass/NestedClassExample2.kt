package com.example.kotlinconcepts.kotlinprogramming.nestedclass


class OuterClass{
    val foo="outer class"

         class InnerClass{
       //  val foo1=foo            //we can't access outer class properties until we declare inner class as inner keyword
            val foo1="hello world"
    }
}
class OuterClass1{
    val foo="outer class"

   inner class InnerClass1{           //we can't access outer class properties until we declare inner class as inner keyword
        val foo1=foo
    }
}


fun main(args: Array<String>) {
    val outerClass=OuterClass1()
    val innerClass=outerClass.InnerClass1()
    print(innerClass.foo1)

    val innerClass1=OuterClass.InnerClass()
    print(innerClass1.foo1)

    //see the difference b/w innerClass and innerClass1 object creation.

}