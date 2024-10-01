package com.example.testapp

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.testapp.databinding.ConstraintLayoutExampleBinding
import kotlin.random.Random

class ConstraintLayoutExample: AppCompatActivity() {

    private lateinit var binding: ConstraintLayoutExampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            enableEdgeToEdge()
            setContentView(R.layout.activity_main)

            val button: Button = findViewById(R.id.button1)
            button.setOnClickListener {
                onButtonClick()
            }
        }
        private fun onButtonClick() {
            val rand = Random.nextInt(0, 101)
            Toast.makeText(this, "Valor gerado: $rand" , Toast.LENGTH_SHORT).show()
        }
    }