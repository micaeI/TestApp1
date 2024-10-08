package com.example.testapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.testapp.databinding.RelativeLayoutExampleBinding
import kotlin.random.Random
import android.widget.Toast

class RelativeLayoutExample: AppCompatActivity() {

    private lateinit var binding: RelativeLayoutExampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = RelativeLayoutExampleBinding.inflate(layoutInflater)
        setContentView(binding.root)

         binding.button1.setOnClickListener {
            val multipleOfFive = genMul(1, 100)
            Toast.makeText(this, "Múltiplo de 5 gerado: $multipleOfFive", Toast.LENGTH_SHORT).show()
            binding.textView1.text = "Múltiplo de 5 gerado: $multipleOfFive"
        }
    }
    
    private fun genMul(start: Int, end: Int): Int {
        val randomNumber = Random.nextInt(start, end)
        return (randomNumber / 5) * 5
    }
}
