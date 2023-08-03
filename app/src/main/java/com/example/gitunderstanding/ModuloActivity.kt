package com.example.gitunderstanding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gitunderstanding.databinding.ActivityModuloBinding

class ModuloActivity : AppCompatActivity() {
    lateinit var moduloBinding: ActivityModuloBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        moduloBinding=ActivityModuloBinding.inflate(layoutInflater)
        val view=moduloBinding.root
        setContentView(view)

        moduloBinding.buttonModResult.setOnClickListener {
            val number1=moduloBinding.editTextNumber1.text.toString().toDouble()
            val number2=moduloBinding.editTextNumber2.text.toString().toDouble()
            val result=number1%number2
            moduloBinding.textViewResult.text=result.toString()
        }
    }
}