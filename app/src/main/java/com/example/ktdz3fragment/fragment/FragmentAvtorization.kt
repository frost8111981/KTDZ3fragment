package com.example.ktdz3fragment.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ktdz3fragment.R
import com.example.ktdz3fragment.databinding.FragmentAvtorizationBinding

class FragmentAvtorization : Fragment() {

    lateinit var binding: FragmentAvtorizationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAvtorizationBinding.inflate(layoutInflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnEnter.setOnClickListener {
            MAIN.navController.navigate(R.id.action_fragmentAvtorization_to_fragmentTask)
        }

    }
}