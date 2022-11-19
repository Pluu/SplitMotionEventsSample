package com.pluu.sample.splitmotionevents

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pluu.sample.splitmotionevents.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.listView.adapter = SampleAdapter()
    }
}