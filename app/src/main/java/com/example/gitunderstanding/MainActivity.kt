package com.example.gitunderstanding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gitunderstanding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var mainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding=ActivityMainBinding.inflate(layoutInflater)
        val view=mainBinding.root
        setContentView(view)

        mainBinding.buttonDiv.setOnClickListener {
            val intent=Intent(this,DivActivity::class.java)
            startActivity(intent)
        }

        mainBinding.buttonMult.setOnClickListener {
            val intent = Intent(this, MultActivity::class.java)
        }
        mainBinding.buttonAdd.setOnClickListener {
            val intent=Intent(this,AddActivity::class.java)
            startActivity(intent)
        }

        mainBinding.buttonSub.setOnClickListener {
            val intent=Intent(this,SubActivity::class.java)
            startActivity(intent)
        }
    }
}