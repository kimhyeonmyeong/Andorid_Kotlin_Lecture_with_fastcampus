package com.example.fastcampus_andorid_kotlin.Kotlin


// 두번까지는 봐준다.
// 두번이 넘어가면 리팩토링 한다.

fun main(args: Array<String>) {
    val superCar100 : SuperCar100 = SuperCar100()

    println(superCar100.drive())


}


// class 앞에는 private가 기본 설정임
// 부모 : Car100
// 자식 : Suoercar100, Bus100

open class Car100() {

    open fun drive(): String {
        println("출발")
        return "달린다"
    }

    fun stop() {

    }
}

class SuperCar100() : Car100() {
    //부모의 함수를 재정의해서 사용한다. (오버라이딩)
    override fun drive(): String {
        val run = super.drive()
        return "빨리 $run"
    }
}

class Bus100() : Car100() {

}