package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // view: 이벤트가 일어났을때 버튼의 역할을 함
    fun onDigit(view: View){
        Toast.makeText(this, "Button Clicked", Toast.LENGTH_LONG).show()
    }
}