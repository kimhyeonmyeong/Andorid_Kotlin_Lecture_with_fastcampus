package com.example.fastcampus_andorid_kotlin

import java.io.Serializable

class PersonfromServer(
    var id : Int? = null,
    var name : String? = null,
    var age : Int? = null,
    var intro : String? = null
) : Serializable