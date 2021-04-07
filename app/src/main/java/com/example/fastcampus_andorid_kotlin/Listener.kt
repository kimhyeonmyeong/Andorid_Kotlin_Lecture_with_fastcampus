package com.example.fastcampus_andorid_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_listener.*
import kotlin.math.log

class Listener : AppCompatActivity() {

        var number = 10

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listener)


        //val textView: TextView = findViewById(R.id.hello)
        //코틀린 방식
        hello

        // 1 : 람다방식
        hello.setOnClickListener {
            Log.d("Click", "Clicked!!")

        }

        // 2 : 익명함수 방식
        hello.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                Log.d("Click", "Clicked!!")
            }
        })

        /* 3 : 이름이 필요한 경우, 최대한 풀어서 쓴 방식 */
        val click = object : View.OnClickListener{
            override fun onClick(v: View?) {
                image.setImageResource(R.drawable.exercise)
                Log.d("Click", "Clicked!!")
                hello.setText("안녕하세요")
                number += 10
                Log.d("number", ""+ number)

            }
        }

        hello.setOnClickListener(click)
        //뷰를 조작하는 함수들
        // 1 : setText
        // 2 : setImageResource



    }
}
