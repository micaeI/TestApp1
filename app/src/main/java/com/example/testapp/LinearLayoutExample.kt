package com.example.testapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.testapp.databinding.LinerLayoutExampleBinding
import kotlin.random.Random
import android.widget.Toast

class LinearLayoutExample: AppCompatActivity() {

    private lateinit var binding: LinerLayoutExampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = LinerLayoutExampleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button2.setOnClickListener {
            val randomOddNumber = generateRandomOdd(1, 9)
            Toast.makeText(this, "Número gerado: $randomOddNumber", Toast.LENGTH_SHORT).show()
        }

       
        binding.button3.setOnClickListener {
            val randomOddNumber = generateRandomOdd(11, 19)
            Toast.makeText(this, "Número gerado: $randomOddNumber", Toast.LENGTH_SHORT).show()
        }

    
        binding.button4.setOnClickListener {
            val randomOddNumber = generateRandomOdd(21, 29)
            Toast.makeText(this, "Número gerado: $randomOddNumber", Toast.LENGTH_SHORT).show()
        }

         binding.button1.setOnClickListener {
            val message = """
                Botão 2 - ímpares 1 a 9
                Botão 3 - ímpares 11 a 19
                Botão 4 - ímpares 21 a 29
            """
            Toast.makeText(this, message, Toast.LENGTH_LONG).show()
        }
    }
    
    private fun generateRandomOdd(start: Int, end: Int): Int {
        var randomOdd = (start..end).random()
        while (randomOdd % 2 == 0) {
            randomOdd = (start..end).random()
        }
        return randomOdd
    }
}
