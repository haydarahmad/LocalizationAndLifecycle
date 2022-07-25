package com.haydar.localizationandlifecycle

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.haydar.localizationandlifecycle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }

        Log.d("Activity",R.string.click_here.toString())
//        Toast.makeText(this,"onCreate",Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Log.d("Activity","onStart invoke")
        Toast.makeText(this,"onstrart",Toast.LENGTH_SHORT).show()
    }
    override fun onResume() {
        super.onResume()
        Log.d("Activity","onResume invoke")
        Toast.makeText(this,"onResume",Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d("Activity","onPause invoke")
        Toast.makeText(this,"onPause",Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d("Activity","onStop invoke")
        Toast.makeText(this,"onStop",Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Activity","onDestroy invoke")
        Toast.makeText(this,"onDestroy",Toast.LENGTH_SHORT).show()
    }
}