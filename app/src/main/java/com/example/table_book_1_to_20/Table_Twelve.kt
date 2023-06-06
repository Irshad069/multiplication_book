package com.example.table_book_1_to_20

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Table_Twelve : AppCompatActivity() {
    private lateinit var text12: TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_table_twelve)
        text12=findViewById(R.id.num12)
        var bundle: Bundle? = intent.extras
        var number = bundle?.getInt("number")
        var str: String = ""

        var count =12
        var index = 1
        for (i in 1..10) {
            str += "$count x $index = ${count * index}\n"
            index++
        }
        text12.text=str
    }
}