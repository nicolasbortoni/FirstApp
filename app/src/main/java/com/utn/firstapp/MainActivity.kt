package com.utn.firstapp

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout

lateinit var txtCartel : TextView
lateinit var btn1 : Button
lateinit var btn2 : Button
lateinit var btn3 : Button
lateinit var btn4 : Button
lateinit var Layout : ConstraintLayout

class MainActivity : AppCompatActivity() {

    val cartel1 = "TEXTO 1"
    val cartel2 = "TEXTO 2"
    var i1 = false
    var i2 = false
    var i3 = false
    var i4 = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtCartel = findViewById(R.id.txtCartel)
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)
        Layout = findViewById(R.id.Layout)

        btn1.setOnClickListener {
            if(i1){
                txtCartel.text = cartel1
                i1 = false
            }
            else{
                txtCartel.text = cartel2
                i1 = true
            }
        }
        btn2.setOnClickListener {
            if(i2){
                txtCartel.setTextColor(Color.MAGENTA)
                i2 = false
            }
            else {
                txtCartel.setTextColor(Color.BLACK)
                i2 = true
            }
        }
        btn3.setOnClickListener {
            if(i3){
                txtCartel.setBackgroundColor(Color.CYAN)
                i3 = false
            }
            else {
                txtCartel.setBackgroundColor(Color.WHITE)
                i3 = true
            }
        }
        btn4.setOnClickListener {
            if(i4){
                Layout.setBackgroundColor(Color.YELLOW)
                i4 = false
            }
            else {
                Layout.setBackgroundColor(Color.WHITE)
                i4 = true
            }
        }

    }
}