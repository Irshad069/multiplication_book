package com.example.table_book_1_to_20

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Table_One : AppCompatActivity() {
    private lateinit var text1:TextView


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_table_one)
        text1 = findViewById(R.id.num1)

        var bundle: Bundle? = intent.extras
        var number = bundle?.getInt("number")
        var str: String = ""

        var count = 1
        var index = 1
        for (i in 1..10) {
            str += "$count x $index = ${count * index}\n"
            index++
        }
        text1.text=str

    }
}