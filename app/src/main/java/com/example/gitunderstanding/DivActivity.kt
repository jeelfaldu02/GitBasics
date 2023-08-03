package com.example.gitunderstanding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gitunderstanding.databinding.ActivityDivBinding

class DivActivity : AppCompatActivity() {
    lateinit var divBinding:ActivityDivBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        divBinding=ActivityDivBinding.inflate(layoutInflater)
        val view=divBinding.root
        setContentView(view)

        divBinding.buttonDivResult.setOnClickListener {
            val number1=divBinding.editTextNumber1.text.toString().toDouble()
            val number2=divBinding.editTextNumber2.text.toString().toDouble()
            val result:Double=number1/number2
            divBinding.textViewResult.text=result.toString()
        }
    }
}