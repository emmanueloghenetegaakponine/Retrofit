package com.tega.retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.tega.retrofit.databinding.ActivityMainBinding
import com.tega.retrofit.ui.MainViewModel
import com.tega.retrofit.ui.RetrofitUserAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var ViewModel: MainViewModel
    private lateinit var retrofitUserAdapter: RetrofitUserAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        retrofitUserAdapter = RetrofitUserAdapter((listOf()))
        ViewModel = ViewModelProvider(this)[MainViewModel::class.java]

        binding.userRv.apply{
            adapter = retrofitUserAdapter
            layoutManager = linearLa
        }
    }
}