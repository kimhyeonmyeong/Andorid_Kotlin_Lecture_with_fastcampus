package com.example.fastcampus_andorid_kotlin.Kotlin

fun main(array: Array<String>){

    val testAcces : TestAcces = TestAcces("아무개")

    //Private 키워드 때문에 웨부에서 더 이상 사용할 수 없다.
    // testAcces.test()
    // println(testAcces.name)
    //testAcces.name = "아무개 2"
    //println(testAcces.name)

    val reward: Reward = Reward()
    reward.rewardAmount = 2000

    val runningCar: RunningCar = RunningCar()
    runningCar.runFast()
    // runningCar.run() 접근 불가

}

class Reward() {
    var rewardAmount: Int = 1000
}
class TestAcces{
    private var name: String = "홍길동"

    constructor(name: String){
        this.name = name
    }

    fun changeName(newName: String){
        this.name = newName
    }

    private fun test(){
        println("테스트")
    }
}
class RunningCar(){

    fun runFast() {
        run()
    }

    private fun run(){

    }
}



