package com.example.testapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.testapp.databinding.GridLayoutExampleBinding

class GridLayoutExample: AppCompatActivity() {

    private lateinit var binding: GridLayoutExampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = GridLayoutExampleBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}