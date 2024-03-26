package com.example.ktdz3fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.ktdz3fragment.databinding.ActivityMainBinding
import com.example.ktdz3fragment.databinding.FragmentAvtorizationBinding
import com.example.ktdz3fragment.fragment.FragmentAvtorization
import com.example.ktdz3fragment.fragment.FragmentTask
import com.example.ktdz3fragment.fragment.MAIN

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        MAIN = this

        navController = Navigation.findNavController(this,R.id.nav_host_fragment)



    }
}