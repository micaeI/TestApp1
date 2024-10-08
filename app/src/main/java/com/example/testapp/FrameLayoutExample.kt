package com.example.testapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.testapp.databinding.FrameLayoutExampleBinding
import kotlin.random.Random
import android.widget.Toast

class FrameLayoutExample: AppCompatActivity() {

    private lateinit var binding: FrameLayoutExampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = FrameLayoutExampleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            onButtonClick()
        }
    }
    private fun onButtonClick() {
        val rand = Random.nextInt(0, 101) * 2 + 1
        Toast.makeText(this, "Valor gerado: $rand", Toast.LENGTH_SHORT).show()
    }
    }
