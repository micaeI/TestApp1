package com.example.testapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.testapp.databinding.GridLayoutExampleBinding
import kotlin.random.Random
import android.widget.Toast

class GridLayoutExample: AppCompatActivity() {

    private lateinit var binding: GridLayoutExampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = GridLayoutExampleBinding.inflate(layoutInflater)
        setContentView(binding.root)

          binding.button1.setOnClickListener {
            val message = """
                Botão 2 - 0 a 9
                Botão 3 - 10 a 19
                Botão 4 - 20 a 29
                Botão 5 - 30 a 39
                Botão 6 -  40 a 49
            """
            Toast.makeText(this, message, Toast.LENGTH_LONG).show()

            binding.button2.setOnClickListener {
            val randomNumber = Random.nextInt(0, 10)
            Toast.makeText(this, "Número gerado: $randomNumber", Toast.LENGTH_SHORT).show()
            }

            binding.button3.setOnClickListener {
            val randomNumber = Random.nextInt(10, 20)
            Toast.makeText(this, "Número gerado: $randomNumber", Toast.LENGTH_SHORT).show()
            }

            binding.button4.setOnClickListener {
            val randomNumber = Random.nextInt(20, 30)
            Toast.makeText(this, "Número gerado: $randomNumber", Toast.LENGTH_SHORT).show()
            }

            binding.button5.setOnClickListener {
            val randomNumber = Random.nextInt(30, 40)
            Toast.makeText(this, "Número gerado: $randomNumber", Toast.LENGTH_SHORT).show()
            }

            binding.button6.setOnClickListener {
            val randomNumber = Random.nextInt(40, 50)
            Toast.makeText(this, "Número gerado: $randomNumber", Toast.LENGTH_SHORT).show()
           }
        }
    }
}
