package com.pjurado.viewmodel01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pjurado.viewmodel01.databinding.ActivityMainBinding
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val numVM = ViewModelProvider(this).get(NumeroViewModel::class.java)

        binding.tvNumVM.text = numVM.getResultado().toString()
        binding.button.setOnClickListener {
            binding.tvNum.text = (binding.tvNum.text.toString().toInt() + 1).toString()
            numVM.setResultado(binding.tvNumVM.text.toString().toInt() + 1)
            binding.tvNumVM.text = numVM.getResultado().toString()
        }
    }
}