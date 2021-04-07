package com.example.fastcampus_andorid_kotlin.Kotlin


fun main(array: Array<String>) {

    // 클래스(설명서)를 통해서 실체를 만드는 방법
    // 인스턴스화 -> 인스턴스를 만듦
    Car("v8 engine", "big")

    val bigCar = Car("v8 engine", "big")

    // 우리가 만든 클래스(설명서)는 자료형이 된다.
    val bigCar1: Car = Car("v8 engine", "big")
    val superCar = SuperCar("super engine", "big", "white")

    // 인스턴스화해서 사용, 인스턴스가 가지고 있는 기능을 사용함
    val runableCar: RunableCar = RunableCar("simple engine", "good body")
    runableCar.ride()
    runableCar.navi("부산")
    runableCar.drive()

    //인스턴스의 멤버변수에 접근하는 방법
    val runableCar2: RunableCar2 = RunableCar2("super engine", "nice body")
    runableCar2.body
    runableCar2.engine

    val testClass: TestClass = TestClass()

    testClass.test(5)
    testClass.test(5, 10)


}

// 클래스를 만드는 방법1
class SuperCar {
    var engine: String
    var body: String
    var door: String

    constructor(engine: String, body: String, door: String) {
        this.engine = engine
        this.body = body
        this.door = door
        println(engine)
        println(body)
        println(door)
    }
}

// 클래스를 만드는 방법2
class Car(var engine: String, var body: String) {

}

//클래스를 만드는 방법3 ->2번 방법의 확장
class Car1(engine: String, body: String) {
    var door: String = ""

    constructor(engine: String, body: String, door: String) : this(engine, body) {

    }
}

// 클래스를 만드는 방법4
class Car2 {
    var engine: String = ""
    var body: String = ""
    var door: String = ""

    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body
    }

    constructor(engine: String, body: String, door: String) {
        this.engine = engine
        this.body = body
        this.door = door
    }

}

class RunableCar(engine: String, body: String) {

    fun ride() {
        println("탑승 하였습니다.")
    }

    fun drive() {
        println("달립니다 !")
    }

    fun navi(destination: String) {
        println("$destination 으로 목적지가 설정되었습니다.")
    }
}

class RunableCar2 {
    var engine: String
    var body: String

    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body
    }
    // class 가 인스턴스화할때 가장 먼저 호출 된다.
    init{
        //초기 셋팅을 할 때 유용하다.
        println("RunableCar2가 만들어졌습니다.")
    }
    fun ride() {
        println("탑승 하였습니다.")
    }

    fun drive() {
        println("달립니다 !")
    }

    fun navi(destination: String) {
        println("$destination 으로 목적지가 설정되었습니다.")
    }
}

// 오버 로딩
// 이름이 같지만 받는 파라미터가 다른 함수
class TestClass() {

    fun test(a:Int){
        println("up")
    }
    fun test(a:Int, b:Int){
        println("down")
    }
}








