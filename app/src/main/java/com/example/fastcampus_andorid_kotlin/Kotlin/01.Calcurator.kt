package com.example.fastcampus_andorid_kotlin.Kotlin


fun main(args: Array<String>) {
    val calculator1 = Calculator1()

    println(calculator1.Add(1, 1))
    println(calculator1.Sub(1, 2))
    println(calculator1.Mul(1, 5))
    println(calculator1.Div(10, 2))
    // calculator1.add(3,4).plus(4.5)
    // -----------/Calculator1
    // -------------------/7
    // -----------------------------/7.plus(4,5)

    val calculator2 = Calculator2()

    println(calculator2.Add(1, 2, 3, 4, 5))
    println(calculator2.Sub(1, 2, 3))
    println(calculator2.Mul(1, 2, 3, 4, 5))
    println(calculator2.Div(10, 2, 3))

    val calculator3 = Calculator3(3)
    val result = calculator3.Add(5).Sub(3).Mul(5)
    println(result)

    // ------/Calculator(3)
    // ---------------------/Calculator(8)
    // -------------------------------------/Calculator(5)
    // ---------------------------------------------------/Calculator(25)
    // -> Chaining(체이닝)


}



class Calculator() {

    fun Add(first: Float, Second: Float) {
        println("first + Second = $ 입니다." + first + Second)
    }

    fun Sub(first: Float, Second: Float) {
        println("first - Second = $ 입니다." + (first - Second))
    }

    fun Mul(first: Float, Second: Float) {
        println("first x Second = $ 입니다." + first * Second)
    }

    fun Div(first: Float, Second: Float) {
        println("first / Second = $ 입니다." + first / Second)
    }

}

class Calculator1() {

    fun Add(first: Int, Second: Int): Int {
        return first + Second
    }

    fun Sub(first: Int, Second: Int): Int {
        return first - Second
    }

    fun Mul(first: Int, Second: Int): Int {
        return first * Second
    }

    fun Div(first: Int, Second: Int): Int {
        return first / Second
    }


}

class Calculator2() {

    fun Add(vararg numbers: Int): Int {
        var result: Int = 0
        numbers.forEach {
            result = result + it
        }
        return result
    }

    fun Sub(vararg numbers: Int): Int {
        var result: Int = numbers[0]

        for (i in 0 until numbers.size) {
            if (i != 0)
                result = result - numbers[i]
        }
        return result
    }

    fun Mul(vararg numbers: Int): Int {
        var result: Int = 1
        numbers.forEach {
            result = result * it
        }
        return result
    }

    fun Div(vararg numbers: Int): Int {
        var result: Int = numbers[0]

        numbers.forEachIndexed { index, value ->
            if (index != 0 && value != 0)
                result = result / value
            if(value == 0)
                println("0으로 나눌 수 없습니다.")

        }
        return result
    }
}

class Calculator3(val initialValue: Int){


    fun Add(number: Int): Calculator3{
        val result = this.initialValue + number
        return Calculator3(result)
    }
    fun Sub(number: Int): Calculator3{
        val result = this.initialValue - number
        return Calculator3(result)
    }
    fun Mul(number: Int): Calculator3{
        val result = this.initialValue * number
        return Calculator3(result)
    }
    fun Div(number: Int): Calculator3{
        val result = this.initialValue / number
        return Calculator3(result)
    }

}



class Accout() {

    fun Add(first: Float, Second: Float) {
        println("first + Second = $ 입니다." + first + Second)
    }

    fun Sub(first: Float, Second: Float) {
        println("first - Second = $ 입니다." + (first - Second))
    }

    fun Mul(first: Float, Second: Float) {
        println("first x Second = $ 입니다." + first * Second)
    }

    fun Div(first: Float, Second: Float) {
        println("first / Second = $ 입니다." + first / Second)
    }

}