package com.example.kotlinconcepts.kotlinprogramming.collection.mixexample


fun mutableList1(){

    var listOfName=ArrayList<String>()      //kotlin ArrayList
    listOfName.add("ramesh")
    listOfName.add("rakesh")
    listOfName.add("mohan")

    for(it in listOfName){
        println(it)
    }

    var listOfState= mutableListOf<String>("madhaya pradesh","Uttar Pradesh","Maharastra")  //mutableList

    println(listOfState.asReversed())
    println(listOfState.subList(1,2))

    listOfState.removeAt(0)         //removeAt()

    println(listOfState)
    
}

fun mutableList2(){
    
    var listOfCity=ArrayList<String>(5)
    
    listOfCity.add("bhopal")
    listOfCity.add("Indore")
    listOfCity.add("jabalpur")
    listOfCity.add("Gwalior")
    listOfCity.add("Ujjain")

    
    for (it in listOfCity){
        println(it)
    }

    var list= arrayListOf(5,"rama",67.9)
    println(list)

    var mutableList= mutableListOf<Any>(3,"rama",67.5)
    println(mutableList)
}

fun main(args: Array<String>) {
    //mutableList1()
     mutableList2()
}