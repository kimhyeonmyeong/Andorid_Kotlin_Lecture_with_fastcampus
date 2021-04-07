package com.example.fastcampus_andorid_kotlin.Kotlin


fun main(args:Array<String>){

    //List
    val numberList = listOf<Int>(1,2,3)
    println(numberList)
    println(numberList.get(0))
    println(numberList[0])


    //Set
    // -> 중복을 허용하지 않음.
    // -> 순서가 없음.
    val numberSet = setOf<Int>(1, 2, 3, 3, 3)
    println(numberSet)
    numberSet.forEach {
        println(it)
    }

    //Map -> key, value 방식으로 관리한다.
    val numberMap = mapOf<String, Int>("one" to 1, "two" to 2)
    println(numberMap)
    println(numberMap.get("one"))

    // mutubale Collections
    val mNumberList = mutableListOf<Int>(1, 2, 3)
    mNumberList.add(2, 4)
    println(mNumberList)

    val mNumberSet = mutableSetOf<Int>(1, 2, 3, 4,4,4)
    mNumberSet.add(10)
    println(mNumberSet)

    val mNumberMap = mutableMapOf<String, Int>("one" to 1)
    mNumberMap.put("two", 2)
    println(mNumberMap)

}
