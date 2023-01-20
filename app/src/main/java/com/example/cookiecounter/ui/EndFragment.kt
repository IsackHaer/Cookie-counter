package com.example.cookiecounter.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.cookiecounter.databinding.FragmentEndBinding

class EndFragment : Fragment() {

    private lateinit var binding: FragmentEndBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentEndBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.fragmentEndRestartBtn.setOnClickListener {
            findNavController().navigate(EndFragmentDirections.actionEndFragmentToHomeFragment())
        }
    }
}