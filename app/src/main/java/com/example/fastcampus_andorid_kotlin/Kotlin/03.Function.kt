package com.example.fastcampus_andorid_kotlin.Kotlin

fun plus(first: Int, second: Int): Int {
    val result: Int = first + second
    return result
}

fun plusFive(first: Int, second: Int = 5): Int {
    val result: Int = first + second
    return result
}


fun printPlus(first: Int, second: Int): Unit {
    val result: Int = first + second
    println(result)
}


//가변 인자를 갖는 함수를 선언하는 방법
fun plusMany(vararg numbers: Int){
    for(number in numbers){
        println(number)
    }
}

fun main(array: Array<String>) {
    var result = plus(5, 10)
    println(result)

    //디폴트 값을 갖는 함수
    println()
    val result4 = plusFive(10, 20)
    println(result4)

    val result5 = plusFive(10)
    println(result5)

    println()
    plusMany(1,2,3)
    plusMany(100)
}
