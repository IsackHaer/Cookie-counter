package com.example.cookiecounter.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.cookiecounter.R
import com.example.cookiecounter.databinding.FragmentClickerBinding

class ClickerFragment : Fragment() {

    private lateinit var binding: FragmentClickerBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentClickerBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var clickerCounter = requireArguments().getInt("counter")
        var totalClicks = requireArguments().getInt("counter")

        binding.fragmentClickerCounterTv.text = clickerCounter.toString()
        binding.fragmentClickerCookieBtn.setImageResource(R.drawable.fullcookie)

        binding.fragmentClickerCookieBtn.setOnClickListener {
            clickerCounter--
            when (clickerCounter) {
                (totalClicks * 75) / 100 -> binding.fragmentClickerCookieBtn.setImageResource(R.drawable._75cookie)
                (totalClicks * 50) / 100 -> binding.fragmentClickerCookieBtn.setImageResource(R.drawable._50cookie)
                (totalClicks * 25) / 100 -> binding.fragmentClickerCookieBtn.setImageResource(R.drawable._25cookie)
                (totalClicks * 10) / 100 -> binding.fragmentClickerCookieBtn.setImageResource(R.drawable._10cookie)
                (totalClicks * 5) / 100 -> binding.fragmentClickerCookieBtn.setImageResource(R.drawable.nocookie)

            }
            binding.fragmentClickerCounterTv.text = clickerCounter.toString()

            if (clickerCounter == 0) {
                findNavController().navigate(ClickerFragmentDirections.actionClickerFragmentToEndFragment())
            }
        }
    }
}