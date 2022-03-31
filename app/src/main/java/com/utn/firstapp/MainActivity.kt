package com.utn.firstapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    lateinit var txtCartel : TextView
    lateinit var btn1 : Button
    lateinit var btn2 : Button
    lateinit var btn3 : Button
    lateinit var btn4 : Button
    lateinit var btnPlus : Button
    lateinit var btnMinus : Button
    lateinit var layout : ConstraintLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        val cartel1 = "TEXTO 1"
        val cartel2 = "TEXTO 2"
        var i1 = false
        var i2 = false
        var i3 = false
        var i4 = false
        var txtSize : Float = 20.0F

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtCartel = findViewById(R.id.txtCartel)
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)
        btnPlus = findViewById(R.id.btnPlus)
        btnMinus = findViewById(R.id.btnMinus)
        layout = findViewById(R.id.Layout)

        btn1.setOnClickListener {
            i1 = if(i1){
                txtCartel.text = cartel1
                false
            }
            else{
                txtCartel.text = cartel2
                true
            }
        }
        btn2.setOnClickListener {
            i2 = if(i2){
                txtCartel.setTextColor(Color.BLACK)
                false
            } else {
                txtCartel.setTextColor(Color.MAGENTA)
                true
            }
        }
        btn3.setOnClickListener {
            i3 = if(i3){
                txtCartel.setBackgroundColor(Color.WHITE)
                false
            } else {
                txtCartel.setBackgroundColor(Color.CYAN)
                true
            }
        }
        btn4.setOnClickListener {
            i4 = if(i4){
                layout.setBackgroundColor(Color.WHITE)
                false
            }
            else {
                layout.setBackgroundColor(Color.YELLOW)
                true
            }
        }
        btnPlus.setOnClickListener {
            txtSize+=1
            txtCartel.setTextSize(txtSize)
        }
        btnMinus.setOnClickListener {
            txtSize-=1
            txtCartel.setTextSize(txtSize)
        }
    }
}