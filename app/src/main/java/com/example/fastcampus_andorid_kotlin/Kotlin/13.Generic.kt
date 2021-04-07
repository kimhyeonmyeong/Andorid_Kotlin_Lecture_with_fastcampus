package com.example.fastcampus_andorid_kotlin.Kotlin

fun main(args: Array<String>){

    // 제너릭을 사용하지 않는 경우
    // 형 변환을 해주어야 합니다.
    val list1 = listOf(1,2,3, "가")
    val b: String = list1[2].toString() // 형변환(타입 변환)

    // 제너릭을 사용하는 경우
    val list2 = listOf<String>("a", "b", "c")
    val c: String = list2[2] // 형변환(타입 변환)

    // 제너릭을 사용하지 않은 경우
    val list5 = listOf<Any>(1, 2, 3, "가") // -> Any
    // 부모: Any
    // 자식: String, Int, Float
}