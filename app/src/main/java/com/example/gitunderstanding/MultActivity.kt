package com.example.gitunderstanding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gitunderstanding.databinding.ActivityMultBinding

class MultActivity : AppCompatActivity() {
    lateinit var multBinding: ActivityMultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        multBinding=ActivityMultBinding.inflate(layoutInflater)
        val view=multBinding.root
        setContentView(view)

        multBinding.buttonMultResult.setOnClickListener {
            val number1=multBinding.editTextNumber1.text.toString().toDouble()
            val number2=multBinding.editTextNumber2.text.toString().toDouble()
            val result=number1*number2
            multBinding.textViewResult.text=result.toString()
        }
    }
}