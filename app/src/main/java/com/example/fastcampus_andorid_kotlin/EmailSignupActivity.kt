package com.example.fastcampus_andorid_kotlin

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class EmailSignupActivity : AppCompatActivity() {

    lateinit var usernameView: EditText
    lateinit var userPassword1View: EditText
    lateinit var userPassword2View: EditText
    lateinit var registerbtn: TextView
    lateinit var loginbtn: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_email_signup)


        if (checkIsLogin()) {
            finish()
            startActivity(
                Intent(this@EmailSignupActivity, OutStagramPostListAcitivity::class.java)
            )
        } else {
            initView(this@EmailSignupActivity)
            setUpListener(this)
        }

    }

    fun initView(activity: Activity) {
        usernameView = activity.findViewById(R.id.username_inputBox)
        userPassword1View = activity.findViewById(R.id.username_passwordBox)
        userPassword2View = activity.findViewById(R.id.username_re_passwordBox)
        registerbtn = activity.findViewById(R.id.register)
        loginbtn = activity.findViewById(R.id.login)

    }

    fun setUpListener(activity: Activity) {
        registerbtn.setOnClickListener {
            register(this@EmailSignupActivity)
        }

        loginbtn.setOnClickListener {
            startActivity(
                Intent(this@EmailSignupActivity, LoginActivity::class.java)
            )
        }
    }

    fun register(activity: Activity) {
        val userName = getUserName()
        val userPassword1 = getUserPassword1()
        val userPassword2 = getUserPassword2()

        (application as MasterApplication).service.register(
            userName, userPassword1, userPassword2
        ).enqueue(object :
            Callback<User> {
            override fun onResponse(call: Call<User>, response: Response<User>) {
                Toast.makeText(activity, "가입을 성공하였습니다.", Toast.LENGTH_LONG).show()
                val user = response.body()
                val token = user!!.token!!
                saveUserToken(token, activity)

                (application as MasterApplication).createRetrofit()
                activity.startActivity(
                    Intent(activity, OutStagramPostListAcitivity::class.java)
                )
            }

            override fun onFailure(call: Call<User>, t: Throwable) {
                Toast.makeText(activity, "가입을 실패하였습니다.", Toast.LENGTH_LONG).show()

            }
        }
        )

    }

    fun saveUserToken(token: String, activity: Activity) {
        val sp = activity.getSharedPreferences("login_sp", Context.MODE_PRIVATE)
        val editor = sp.edit()
        editor.putString("login_sp", token)
        editor.commit()
    }

    fun getUserName(): String {
        return usernameView.text.toString()
    }

    fun getUserPassword1(): String {
        return userPassword1View.text.toString()
    }

    fun getUserPassword2(): String {
        return userPassword2View.text.toString()
    }

    fun checkIsLogin(): Boolean {
        val sp = getSharedPreferences("login_sp", Context.MODE_PRIVATE)
        val token = sp.getString("login_sp", "null")
        if (token != "null") return true
        else return false

    }

}

