package com.example.assignment2_luisrodriguezz_kerrywilcher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val barFragment = BarFragment()
        val linefragment = LineFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fContainer,barFragment)
                commit()
        }
        findViewById<Button>(R.id.Bbutton).setOnClickListener{
            supportFragmentManager.beginTransaction().apply{
                replace(R.id.fContainer,barFragment)
                commit()
            }

        }
        findViewById<Button>(R.id.LButton).setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fContainer,linefragment)
                commit()
            }
        }
    }
}