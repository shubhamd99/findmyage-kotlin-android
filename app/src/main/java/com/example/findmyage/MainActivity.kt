package com.example.findmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buGetAge.setOnClickListener{
            buttonClick()
        }
    }

    fun buttonClick() {
        // Value of the InputBox
        val userDOB = Integer.parseInt(etDOB.text.toString())

        // The getInstance() method of java.util.Calendar class is a Static method.
        // This method is used with calendar object to get the instance of calendar according to current time zone
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)

        val userAgeInYears = currentYear - userDOB

        // tvShowAge is the Id of the Text View
        tvShowAge.text = "Your Age is $userAgeInYears Years"
    }
}