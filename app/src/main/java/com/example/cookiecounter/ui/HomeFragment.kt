package com.example.cookiecounter.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.cookiecounter.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.fragmentHomeEasyBtn.setOnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToClickerFragment(10))
        }

        binding.fragmentHomeNormalBtn.setOnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToClickerFragment(20))
        }

        binding.fragmentHomeHardBtn.setOnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToClickerFragment(50))
        }
    }
}