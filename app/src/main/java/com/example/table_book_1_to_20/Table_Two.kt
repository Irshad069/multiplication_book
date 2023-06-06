package com.example.table_book_1_to_20

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Table_Two : AppCompatActivity() {
    private lateinit var text2:TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_table_two)

        text2=findViewById(R.id.num2)
        var bundle: Bundle? = intent.extras
        var number = bundle?.getInt("number")
        var str: String = ""

        var count = 2
        var index = 1
        for (i in 1..10) {
            str += "$count x $index = ${count * index}\n"
            index++
        }
        text2.text=str
    }
}