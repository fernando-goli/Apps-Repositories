package com.fgomes.githubrepository.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fgomes.githubrepository.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
    }
}