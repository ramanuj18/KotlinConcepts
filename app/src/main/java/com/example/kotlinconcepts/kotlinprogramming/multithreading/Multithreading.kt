package com.example.kotlinconcepts.kotlinprogramming.multithreading

fun main(args: Array<String>) {
var thread=MyThread("myThread1")
    thread.start()

    var myThread2=MyThread("myThread2")
    myThread2.start()

    var myThread3=MyThread("myThread3")
    myThread3.start()
    myThread3.join()
    println("thread run")
}

class MyThread():Thread(){
        lateinit var threadName:String
    constructor(str:String):this(){
        this.threadName=str
    }
    override fun run() {
        for (i in 1..10){
            println("$threadName count $i")
            sleep(1000)
        }
    }
}