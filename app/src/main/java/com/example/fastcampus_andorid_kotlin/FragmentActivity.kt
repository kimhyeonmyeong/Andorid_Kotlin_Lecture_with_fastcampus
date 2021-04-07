package com.example.fastcampus_andorid_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_fragment.*

class FragmentActivity : AppCompatActivity(), Fragmentone.OnDataPassListener {

    override fun onDataPass(data: String?) {
        Log.d("pass", "" + data)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
        val fragmentOne : Fragmentone = Fragmentone()
        // 프래그먼트에 data를 넣어주는 방법

        val bundle: Bundle = Bundle()
        bundle.putString("hello", "it is in bundle")
        fragmentOne.arguments = bundle

        button.setOnClickListener {

            val fragmentManager = supportFragmentManager

            // Transaction
            // 작업의 단위 시작과 끝이 있음
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container, fragmentOne)
            fragmentTransaction.commit()
            // 끝을 내는 방법
            // commit : 시간 날 떄 사용함
            // commitnow : 당장 사용하라는 의미임
        }

        button_remove.setOnClickListener {

            val fragmentManager = supportFragmentManager
            // Transaction
            // 작업의 단위 시작과 끝이 있음
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.remove(fragmentOne)
            fragmentTransaction.commit()
        }
    }
    override fun onStart() {
        super.onStart()
        Log.d("Life_cycle", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Life_cycle", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Life_cycle", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Life_cycle", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Life_cycle", "onDestroy")
    }
}
