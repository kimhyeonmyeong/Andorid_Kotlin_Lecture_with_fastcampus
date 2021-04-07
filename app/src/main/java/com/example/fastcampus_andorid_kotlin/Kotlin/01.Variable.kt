package com.example.fastcampus_andorid_kotlin.Kotlin

//01. Variable -> 변수
//


var num = 10
var hello = "hello"
var point = 3.4
val fix = 20

fun main(args: Array<String>){
       println(num)
       println(hello)
       println(point)
       println(fix)

       num = 100
       hello = "hi"
       point = 10.4

       //fix = 30

       println(num)
       println(hello)
       println(point)
       println(fix)

}

//fix는 마음대로 바꿀 수 없음