package com.example.fastcampus_andorid_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView

class PhoneBook : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_book)
        val personList = ArrayList<Person>()

        val phoneBook = createFakePhoneBook()
        createPhoneBookList(phoneBook)
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

    fun createPhoneBookList(phoneBookClass: phoneBookClass) {
        val layoutInflater = LayoutInflater.from(this@PhoneBook)
        val container = findViewById<LinearLayout>(R.id.phonebook_list_container)

        for (i in 0 until phoneBookClass.personList.size) {
            val view = layoutInflater.inflate(R.layout.phonebook_item, null)
            val personNameView = view.findViewById<TextView>(R.id.user)
            personNameView.setText(phoneBookClass.personList.get(i).name)
            addSetOnClickListener(phoneBookClass.personList.get(i), view)
            container.addView(view)
        }
    }

    fun addSetOnClickListener(person: Person, view : View){
        view.setOnClickListener {
            val intent = Intent(this@PhoneBook, PhoneBookDetail::class.java)
            intent.putExtra("name", person.name)
            intent.putExtra("number", person.number)
            startActivity(intent)
        }
    }
}

class phoneBookClass() {
    // 전화 번호부
    val personList = ArrayList<Person>()

    fun addPerson(person: Person) {
        personList.add(person)
    }

}
class Person(val name: String, var number: String) {

}
