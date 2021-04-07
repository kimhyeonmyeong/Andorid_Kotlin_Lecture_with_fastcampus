package com.example.fastcampus_andorid_kotlin.Kotlin

// - 인터페이스도 구현이 있는 함수를 만들 수 있습니다.
// - 인터페이스에 구현이 있는 함수는 그 인터페이스를 구현하는 클래스에서 그 함수를 구현할 필요가 없다.
// - 인터페이스에 구현이 없는 함수는 그 인터페이스를 구현하는 클래스에서 그 함수를 반듯이 구현해야 한다.
fun main(args: Array<String>){
    val student = Student__()
    student.sleep()
}


interface Person__ {
    fun eat(){
        println("먹는다")
    }
    fun sleep(){
        println("잔다")
    }
    //반드시 구현해주어야 하는 함수입니다.
    abstract fun study()
}

class Student__ : Person__{
    override fun study() {
        TODO("Not yet implemented")
    }
}

class Teacher__ : Person__{
    override fun study() {
        TODO("Not yet implemented")
    }
}