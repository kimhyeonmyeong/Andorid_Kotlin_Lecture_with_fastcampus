package com.example.fastcampus_andorid_kotlin.Kotlin

var number100: Int = 10

fun main(args: Array<String>){
    println(number100)

    val test = Test("홍길동")
    test.testFun()
    test.name
    println(number100)
}

class Test(var name: String){
    fun testFun(){
        name = "홍길동"
        number100 = 100
        var birth: String = "2000/01/31"
        fun testFun2(){
            var gender: String = "male"
        }
    }

    fun testFun3(){
        name
        //birth (접근 불가)
    }


}