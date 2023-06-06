package com.example.table_book_1_to_20

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Table_Eleven : AppCompatActivity() {
    private lateinit var text11: TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_table_eleven)
        text11=findViewById(R.id.num11)
        var bundle: Bundle? = intent.extras
        var number = bundle?.getInt("number")
        var str: String = ""

        var count =11
        var index = 1
        for (i in 1..10) {
            str += "$count x $index = ${count * index}\n"
            index++
        }
        text11.text=str
    }
}