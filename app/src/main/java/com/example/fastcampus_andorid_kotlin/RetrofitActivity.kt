package com.example.fastcampus_andorid_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retrofit)
/*
        http://mellocodw.org/json/students/
        http://mellocodw.org/(서버 도메인 주소)test/code/
*/
        val retrofit = Retrofit.Builder()
            .baseUrl("http://mellowcode.org/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service = retrofit.create(RetrofitService::class.java)
        //GET 요청
        service.getStudentsList().enqueue(object : Callback<ArrayList<PersonfromServer>> {
            override fun onResponse(
                call: Call<ArrayList<PersonfromServer>>,
                response: Response<ArrayList<PersonfromServer>>
            ) {
                if (response.isSuccessful) {
                    val personList = response.body()
                    Log.d("retrofit", "res : " + personList?.get(0)?.name)

                    val code = response.code()
                    Log.d("retrofit", "code : " + code)

                    val header = response.headers()
                    Log.d("retrofit", "header : " + header)

//                  var error = response.errorBody()

                }
            }
            override fun onFailure(call: Call<ArrayList<PersonfromServer>>, t: Throwable) {
                Log.d("retrofit", "ERROR")
            }
        }
        )

        //POST 요청1
            val params = HashMap<String,Any>()
            params.put("name", "김짱짱")
            params.put("age", "20")
            params.put("Intro", "안녕하세요")
            service.createStudent(params).enqueue(object : Callback<PersonfromServer>
            {
                override fun onResponse(
                    call: Call<PersonfromServer>,
                    response: Response<PersonfromServer>
                ) {
                    if(response.isSuccessful){
                        val person = response.body()
                        Log.d("retrofit", "name :" + person?.name)
                    }
                }

                override fun onFailure(call: Call<PersonfromServer>, t: Throwable) {
                    Log.d("retrofit", "ERROR")
                }
            })
        //POST 요청1
            val person = PersonfromServer(name = "김영희", age = 15, intro = "BTS 사랑해요")
            service.createStudentEasy(person).enqueue(object : Callback<PersonfromServer>
            {
                override fun onResponse(
                    call: Call<PersonfromServer>,
                    response: Response<PersonfromServer>
                ) {
                    if(response.isSuccessful){
                        val person = response.body()
                        Log.d("retrofit", "name :" + person?.name)
                    }
                }

                override fun onFailure(call: Call<PersonfromServer>, t: Throwable) {
                    Log.d("retrofit", "ERROR")
                }
            })

    }
}


