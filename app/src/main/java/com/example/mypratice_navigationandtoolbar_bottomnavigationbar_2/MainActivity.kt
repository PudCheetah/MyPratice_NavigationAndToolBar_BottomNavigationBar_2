package com.example.mypratice_navigationandtoolbar_bottomnavigationbar_2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.mypratice_navigationandtoolbar_bottomnavigationbar_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //只使用BottomNavigationView
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //加載menu
        binding.bottomNavigationView.inflateMenu(R.menu.menu_bottom_nav_bar)

        //取得NavController
        val navHostFragment = binding.fragmentContainerView.getFragment<NavHostFragment>()
        val navController = navHostFragment.findNavController()

        //將bottomNavigationView和NavController關聯
        binding.bottomNavigationView.setupWithNavController(navController)
    }
}