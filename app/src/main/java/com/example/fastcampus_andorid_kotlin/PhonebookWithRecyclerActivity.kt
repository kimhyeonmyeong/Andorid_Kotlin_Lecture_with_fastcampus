package com.example.fastcampus_andorid_kotlin

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_phonebook_with_recycler.*

class PhonebookWithRecyclerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phonebook_with_recycler)

        val phoneBookClass = createFakePhoneBook(fakeNumber = 30)
        val phoneBookRecyclerAdapter = PhoneBookRecyclerAdapter(
            phoneBookClass = phoneBookClass,
            inflater = LayoutInflater.from(this@PhonebookWithRecyclerActivity),
            activity = this
        )

        PhoneBook_Recycler_view.adapter = phoneBookRecyclerAdapter
        PhoneBook_Recycler_view.layoutManager =
            LinearLayoutManager(this@PhonebookWithRecyclerActivity)

    }


    fun createFakePhoneBook(fakeNumber: Int = 10, phoneBookClass: phoneBookClass = phoneBookClass())
            : phoneBookClass {
        for (i in 0 until fakeNumber) {
            phoneBookClass.addPerson(
                Person(name = "" + i + "번째 사람", number = "" + i + "번째 사람의 전화번호")
            )
        }
        return phoneBookClass
    }
}


class PhoneBookRecyclerAdapter(
    val phoneBookClass: phoneBookClass,
    val inflater: LayoutInflater,
    val activity: Activity
) : RecyclerView.Adapter<PhoneBookRecyclerAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val personName: TextView

        init {
            personName = itemView.findViewById(R.id.user)
            itemView.setOnClickListener {
                val intent = Intent(activity, PhoneBookDetail::class.java)
                intent.putExtra("name", phoneBookClass.personList.get(adapterPosition).name)
                intent.putExtra("number", phoneBookClass.personList.get(adapterPosition).number)
                activity.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = inflater.inflate(R.layout.phonebook_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return phoneBookClass.personList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.personName.setText(phoneBookClass.personList.get(position).name)
    }
}