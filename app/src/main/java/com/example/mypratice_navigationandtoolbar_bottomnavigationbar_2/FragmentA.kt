package com.example.mypratice_navigationandtoolbar_bottomnavigationbar_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mypratice_navigationandtoolbar_bottomnavigationbar_2.databinding.FragmentABinding

class FragmentA : Fragment() {
    private lateinit var binding: FragmentABinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        binding = FragmentABinding.inflate(inflater, container, false)

        return binding.root
    }

}