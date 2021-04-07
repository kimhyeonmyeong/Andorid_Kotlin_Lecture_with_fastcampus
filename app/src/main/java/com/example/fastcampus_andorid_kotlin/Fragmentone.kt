package com.example.fastcampus_andorid_kotlin

import android.content.Context
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_one.*


class Fragmentone : Fragment() {


    interface OnDataPassListener {
        fun onDataPass(data: String?)
    }
        lateinit var dataPassListener: OnDataPassListener

    override fun onAttach(context: Context) {
        Log.d("Life_cycle", "F onAttach")
        super.onAttach(context)
        dataPassListener = context as OnDataPassListener

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("Life_cycle", "F onCreate")
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // 프레그먼트가 인터페이스를 처음으로 그릴 때 호출됩니다.
        // inflater : View를 그려주는 역할입니다.
        // container : 부모뷰
        return inflater.inflate(R.layout.fragment_one, container, false)

        Log.d("Life_cycle", "F onCreateView")
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d("Life_cycle", "F onViewCreated")
        super.onViewCreated(view, savedInstanceState)

        //Activity에서 했던 작업을 보통 여기서 합니다.

        pass.setOnClickListener {
            dataPassListener.onDataPass("Good bye")
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.d("Life_cycle", "F onActivityCreated")
        super.onActivityCreated(savedInstanceState)
        val data = arguments?.getString("hello")
        Log.d("fragment_data", data)
    }

    override fun onStart() {
        super.onStart()
        Log.d("Life_cycle", "F onStart")
    }
    override fun onResume() {
        super.onResume()
        Log.d("Life_cycle", "F onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Life_cycle", "F onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Life_cycle", "F onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("Life_cycle", "F onDestroyView")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("Life_cycle", "F onDetach")
    }
}