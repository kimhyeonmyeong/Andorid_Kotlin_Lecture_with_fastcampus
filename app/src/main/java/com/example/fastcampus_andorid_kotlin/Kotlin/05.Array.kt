package com.example.fastcampus_andorid_kotlin.Kotlin


// 배열이 필요한 이유
// 그룹이 필요할 경우

fun main(array: Array<String>){

    //배열을 생성하는 방법(1)
    var number : Int = 10
    var group1 = arrayOf<Int>(1, 2, 3, 4, 5)
    println(group1 is Array)

    //변수에 타입 지정안하면 알아서 지정해줌
    //배열을 생성하는 방법(2)
    var number2 = 10
    var group2 = arrayOf(1,2,3,4,5)
    //배열은 타입을 지정하지 않으면 아무것이나 넣을 수 있음
    var group3 = arrayOf(1,2,3,4, "hello")

    // Index 란
    // {1, 2, 3, 4, 5}
    //배열의 값을 꺼내는 방법(1)
    val test1 = group1.get(0)
    val test2 = group2.get(4)

    println(test1)
    println(test2)

    //배열의 값을 꺼내는 방법(2)
    val test3 = group1[0]
    println(test3)

    //배열의 값을 바꾸는 방법(1)
    group1.set(0, 100)
    println(group1[0])

    //배열의 값을 바꾸는 방법(2)
    group1[0] = 200
    println(group1[0])

    val array = arrayOf<Int>(1,2,3)

    val num = array.get(0)
    println(num)

    //val num2 = array.get(100) // Index 범위에 주의한다.

    array.set(0, 100)
    val num2 = array.get(0)

    //Array를 만드는 방법(3)
    val a1 = intArrayOf(1, 2, 3)
    val a2 = charArrayOf('a', 'b')
    val a3 = doubleArrayOf(1.2, 110.205)
    val a4 = booleanArrayOf(true, false, true)



}