package com.example.fastcampus_andorid_kotlin.Kotlin


// - 인터페이스는 약속 !
// - 생성자가 없다 -> 인스턴스화 시킬 수 없다 -> 설명서가 아니다.
// - 지침서 -> 이것을 구현하고 싶으면 반드시 아래 기능을 구현해야 합니다.
fun main(args: Array<String>){
    val student_ : Student_ = Student_()
    student_.eat()
    student_.sleep()
}


interface Person_ {
    fun eat()
    fun sleep()
}
class Student_ : Person_ {
    override fun eat() {
        TODO("Not yet implemented")
    }

    override fun sleep() {
        TODO("Not yet implemented")
    }
}

class SoccerPlayer : Person_{
    override fun eat() {
        TODO("Not yet implemented")
    }

    override fun sleep() {
        TODO("Not yet implemented")
    }
}


open class Person(){
    open fun eat(){

    }
    fun sleep(){

    }

}


class Student(): Person(){
    override fun eat() {
        super.eat()
    }
}
class Teacher():Person(){

}