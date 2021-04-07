package com.example.fastcampus_andorid_kotlin.Kotlin

// 08. 제어 흐름
// if, else

fun main(args: Array<String>) {
    val a: Int = 5
    val b: Int = 10

    //값을 return하는 제어흐름 방법


    if (a > b) {
        println("a가 b보다 크다")
    }

    //코틀린 >> 줄여서 쓸 수 있음
    if (a > b)
        println("a가 b보다 크다")

    // 앨비스 연산자(코틀린)
    val number: Int? = null
    val number2 = number ?: 10
    println()
    println(number2)

    val num1: Int = 10
    val num2: Int = 20

    val max = if (num1 > num2) {
        num1
    } else if (num1 == num2) {
        num2
    } else {
        num1 + num2
    }
    //when
    val value: Int = 3

    when (value){
        1 -> {
            println("value is 1")
        }
        2 -> {
            println("value is 2")
        }
        3 -> {
            println("value is 3")
        }
        else -> {
            println("There is no value")
        }
    }
    //코틀린에선 생략 가능
    when (value){
        1 -> println("value is 1")
        2 -> println("value is 2")
        3 -> println("value is 3")
        else -> println("There is no value")
    }
    //값을 반환하여 사용하는 경우
    val value2 = when(value){
        1 -> 10
        2 -> 20
        3 -> 30
        else -> 100
    }
    println(value2)

    val value3: Int?= null

    when(value3){
        null -> println("value is null")
        else -> println("value is not null")
    }

    val value4: Boolean? = null

    // when 구문은 조건으로 갖는 값의 모든 경우에 대응 해주는 것이 좋다.
    when(value4){
        true -> println("")
        false -> println("")
        null -> println("")
    }

    val value5 = when(value4){
        true -> 1
        false -> 2
        else -> 4
    }
    when(value5){
        is Int -> println("Value5 is int type")
        else -> println("Value5 is not int type")
    }
    println(value5)
}