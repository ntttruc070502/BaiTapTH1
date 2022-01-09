package com.example.baitapth1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_cong.setOnClickListener {
            var so1 : Double = (number1.text.toString()).toDouble()
            var so2 : Double = (number2.text.toString()).toDouble()
            var kq: Double = so1 + so2
            ketqua.text = kq.toString()

        }
    }
}