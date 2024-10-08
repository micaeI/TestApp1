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

         binding.button1grid.setOnClickListener {
            val message = """
                Botão do frame layout
            """
            Toast.makeText(this, message, Toast.LENGTH_LONG).show()
            }
    }
    }
