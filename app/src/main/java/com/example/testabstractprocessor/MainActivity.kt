package com.example.testabstractprocessor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.annotation.MyIntercept


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}