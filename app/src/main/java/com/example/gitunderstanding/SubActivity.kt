package com.example.gitunderstanding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gitunderstanding.databinding.ActivityAddBinding
import com.example.gitunderstanding.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {
    lateinit var subBinding:ActivitySubBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        subBinding=ActivitySubBinding.inflate(layoutInflater)
        val view=subBinding.root
        setContentView(view)

        subBinding.buttonSubResult.setOnClickListener {
            val number1=subBinding.editTextNumber1.text.toString().toDouble()
            val number2=subBinding.editTextNumber2.text.toString().toDouble()
            val result=number1-number2
            subBinding.textViewResult.text=result.toString()
        }
    }
}