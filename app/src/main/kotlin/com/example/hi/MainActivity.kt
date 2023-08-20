package com.example.hi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tinyappco.helloworld.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnGreet.setOnClickListener{
            binding.tvGreeting.text = getString(R.string.hello_android)
        }
    }
}