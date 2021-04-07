package com.example.fastcampus_andorid_kotlin.Kotlin

fun main(array: Array<String>) {

    val a = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)

    // 반복하는 방법 (1)
    for (item in a) {
        if (item == 5) {
            println("item is Five")
        } else {
            println("item is not Five")
        }
    }
    println()

    // 반복하는 방법(2)
    for ((index, item) in a.withIndex()) {
        println("Index :" + index + " value : " + item)
    }

    // 반복하는 방법(3) -> lambda를 사용한 문법임.
    a.forEach{
        println(it)
    }

    // 반복하는 방법(4)
    a.forEach{ item ->
        println(item)
    }

    // 반복하는 방법(5)
    a.forEachIndexed { index, item ->
        println("Index :" + index + " value : " + item)
    }

    // 반복하는 방법(6)
    println(a.size)

    for (i in 0 until a.size){
        // until은 마지막을 포함 하지 않는다.
        // 0부터 8까지(index)
        println(a.get(i))
    }

    // 반복하는 방법(7)
    for (i in 0 until a.size step(2)){
        println(a.get(i))
    }

    // 반복하는 방법(8)
    for (i in a.size -1 downTo (0)){
        //8부터 0까지 반복
        print(a[i])
    }
    // 반복하는 방법(9)
    for (i in a.size -1 downTo (0) step(2)){
        //8부터 0까지 반복
        print(a[i])
    }
    // 반복하는 방법(10)
    for (i in 0 .. 10){
        println(i)
    }

}