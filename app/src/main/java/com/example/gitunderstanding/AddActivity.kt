package com.example.gitunderstanding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gitunderstanding.databinding.ActivityAddBinding

class AddActivity : AppCompatActivity() {
    lateinit var addBinding:ActivityAddBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        addBinding=ActivityAddBinding.inflate(layoutInflater)
        val view=addBinding.root
        setContentView(view)

        addBinding.buttonAddResult.setOnClickListener {
            val number1=addBinding.editTextNumber1.text.toString().toDouble()
            val number2=addBinding.editTextNumber2.text.toString().toDouble()
            val result=number1+number2
            addBinding.textViewResult.text=result.toString()
        }
    }
}