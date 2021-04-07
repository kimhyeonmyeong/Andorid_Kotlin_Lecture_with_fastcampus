package com.example.fastcampus_andorid_kotlin

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_shared_preference.*

class SharedPreference : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preference)

        //SharedPreference
        //  Mode
        // -MODE_PRIVATE : 생성한 application에서만 사용 가능
        // -MODE_WORLD_READABLE : 다른 application에서 사용 가능 > 읽을 수만 있음
        // -MODE_WORLD_WRITEABLE : 다른 application에서 사용 가능 > 기록도 가능


        //sp1 -> Sharedpreference

        save_button.setOnClickListener {
            val sharedPreference = getSharedPreferences("sp1", Context.MODE_PRIVATE)
            val editor: SharedPreferences.Editor = sharedPreference.edit()
            editor.putString("hello", "안녕하세요")
            editor.putString("goodBye", "안녕히 가세요")
            editor.commit()
        }
        load_button.setOnClickListener {
            val sharedPreference = getSharedPreferences("sp1", Context.MODE_PRIVATE)
            val value1 = sharedPreference.getString("hello", "데이터 없음")
            val value2 = sharedPreference.getString("goodBye", "데이터 없음")
            Log.d("key-value", "Value1 :" + value1)
            Log.d("key-value", "Value2 :" + value2)
        }


        delete_button.setOnClickListener {
            val sharedPreference = getSharedPreferences("sp1", Context.MODE_PRIVATE)
            val editor: SharedPreferences.Editor = sharedPreference.edit()
            editor.remove("hello")
            editor.commit()

        }

        delete_all_button.setOnClickListener {
            val sharedPreference = getSharedPreferences("sp1", Context.MODE_PRIVATE)
            val editor: SharedPreferences.Editor = sharedPreference.edit()
            editor.clear()
            editor.commit()

        }

    }
}
