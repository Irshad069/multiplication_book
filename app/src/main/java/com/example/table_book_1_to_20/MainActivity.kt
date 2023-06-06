package com.example.table_book_1_to_20

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btn1:Button
    private lateinit var btn2:Button
    private lateinit var btn3:Button
    private lateinit var btn4:Button
    private lateinit var btn5:Button
    private lateinit var btn6:Button
    private lateinit var btn7:Button
    private lateinit var btn8:Button
    private lateinit var btn9:Button
    private lateinit var btn10:Button
    private lateinit var btn11:Button
    private lateinit var btn12:Button
    private lateinit var btn13:Button
    private lateinit var btn14:Button
    private lateinit var btn15:Button
    private lateinit var btn16:Button
    private lateinit var btn17:Button
    private lateinit var btn18:Button
    private lateinit var btn19:Button
    private lateinit var btn20:Button

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1=findViewById(R.id.one)
        btn2=findViewById(R.id.two)
        btn3=findViewById(R.id.three)
        btn4=findViewById(R.id.four)
        btn5=findViewById(R.id.five)
        btn6=findViewById(R.id.six)
        btn7=findViewById(R.id.seven)
        btn8=findViewById(R.id.eight)
        btn9=findViewById(R.id.nine)
        btn10=findViewById(R.id.ten)
        btn11=findViewById(R.id.eleven)
        btn12=findViewById(R.id.twelve)
        btn13=findViewById(R.id.thirteen)
        btn14=findViewById(R.id.fourteen)
        btn15=findViewById(R.id.fifteen)
        btn16=findViewById(R.id.sixteen)
        btn17=findViewById(R.id.seventeen)
        btn18=findViewById(R.id.eighteen)
        btn19=findViewById(R.id.nineteen)
        btn20=findViewById(R.id.twenty)

        btn1.setOnClickListener {
            var number= 1
            var index=1
           val intent=Intent(this,Table_One::class.java)
            intent.putExtra("number",index)
            intent.putExtra("index",number)
            startActivity(intent)
        }
        btn2.setOnClickListener {
            var number= 2
            var index=1
            val intent=Intent(this,Table_Two::class.java)
            intent.putExtra("number",index)
            intent.putExtra("index",number)
            startActivity(intent)
        }
        btn3.setOnClickListener {
            var number= 3
            var index=1
            val intent=Intent(this,Table_Three::class.java)
            intent.putExtra("number",index)
            intent.putExtra("index",number)
            startActivity(intent)
        }
        btn4.setOnClickListener {
            var number= 4
            var index=1
            val intent=Intent(this,Table_Four::class.java)
            intent.putExtra("number",index)
            intent.putExtra("index",number)
            startActivity(intent)
        }
        btn5.setOnClickListener {
            var number= 5
            var index=1
            val intent=Intent(this,Table_Five::class.java)
            intent.putExtra("number",index)
            intent.putExtra("index",number)
            startActivity(intent)
        }
        btn6.setOnClickListener {
            var number= 6
            var index=1
            val intent=Intent(this,Table_Six::class.java)
            intent.putExtra("number",index)
            intent.putExtra("index",number)
            startActivity(intent)
        }
        btn7.setOnClickListener {
            var number= 7
            var index=1
            val intent=Intent(this,Table_Seven::class.java)
            intent.putExtra("number",index)
            intent.putExtra("index",number)
            startActivity(intent)
        }
        btn8.setOnClickListener {
            var number= 8
            var index=1
            val intent=Intent(this,Table_Eight::class.java)
            intent.putExtra("number",index)
            intent.putExtra("index",number)
            startActivity(intent)
        }
        btn9.setOnClickListener {
            var number= 9
            var index=1
            val intent=Intent(this,Table_Nine::class.java)
            intent.putExtra("number",index)
            intent.putExtra("index",number)
            startActivity(intent)
        }
        btn10.setOnClickListener {
            var number= 10
            var index=1
            val intent=Intent(this,Table_Ten::class.java)
            intent.putExtra("number",index)
            intent.putExtra("index",number)
            startActivity(intent)
        }
        btn11.setOnClickListener {
            var number= 11
            var index=1
            val intent=Intent(this,Table_Eleven::class.java)
            intent.putExtra("number",index)
            intent.putExtra("index",number)
            startActivity(intent)
        }
        btn12.setOnClickListener {
            var number= 12
            var index=1
            val intent=Intent(this,Table_Twelve::class.java)
            intent.putExtra("number",index)
            intent.putExtra("index",number)
            startActivity(intent)
        }
        btn13.setOnClickListener {
            var number= 13
            var index=1
            val intent=Intent(this,Table_Thirteen::class.java)
            intent.putExtra("number",index)
            intent.putExtra("index",number)
            startActivity(intent)
        }
        btn14.setOnClickListener {
            var number= 14
            var index=1
            val intent=Intent(this,Table_Fourteen::class.java)
            intent.putExtra("number",index)
            intent.putExtra("index",number)
            startActivity(intent)
        }
        btn15.setOnClickListener {
            var number= 15
            var index=1
            val intent=Intent(this,Table_Fifteen::class.java)
            intent.putExtra("number",index)
            intent.putExtra("index",number)
            startActivity(intent)
        }
        btn16.setOnClickListener {
            var number= 16
            var index=1
            val intent=Intent(this,Table_Sixteen::class.java)
            intent.putExtra("number",index)
            intent.putExtra("index",number)
            startActivity(intent)
        }
        btn17.setOnClickListener {
            var number= 17
            var index=1
            val intent=Intent(this,Table_Seventeen::class.java)
            intent.putExtra("number",index)
            intent.putExtra("index",number)
            startActivity(intent)
        }
        btn18.setOnClickListener {
            var number= 18
            var index=1
            val intent=Intent(this,Table_Eighteen::class.java)
            intent.putExtra("number",index)
            intent.putExtra("index",number)
            startActivity(intent)
        }
        btn19.setOnClickListener {
            var number= 19
            var index=1
            val intent=Intent(this,Table_Nineteen::class.java)
            intent.putExtra("number",index)
            intent.putExtra("index",number)
            startActivity(intent)
        }
        btn20.setOnClickListener {
            var number= 20
            var index=1
            val intent=Intent(this,Table_Twenty::class.java)
            intent.putExtra("number",index)
            intent.putExtra("index",number)
            startActivity(intent)
        }
    }
}