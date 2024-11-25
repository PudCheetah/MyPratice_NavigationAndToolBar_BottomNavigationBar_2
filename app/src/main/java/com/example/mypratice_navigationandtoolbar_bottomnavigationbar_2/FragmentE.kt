package com.example.mypratice_navigationandtoolbar_bottomnavigationbar_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mypratice_navigationandtoolbar_bottomnavigationbar_2.databinding.FragmentEBinding

class FragmentE : Fragment() {
    private lateinit var binding: FragmentEBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        binding = FragmentEBinding.inflate(inflater, container, false)

        return binding.root
    }

}