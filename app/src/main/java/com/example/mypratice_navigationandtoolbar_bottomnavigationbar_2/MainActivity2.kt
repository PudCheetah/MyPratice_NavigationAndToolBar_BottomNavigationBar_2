package com.example.mypratice_navigationandtoolbar_bottomnavigationbar_2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.example.mypratice_navigationandtoolbar_bottomnavigationbar_2.databinding.ActivityMain2Binding
import com.example.mypratice_navigationandtoolbar_bottomnavigationbar_2.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    //使用BottomNavigationView、ToolBar、AppBarConfiguration
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        //加載menu
        binding.materialToolbar.inflateMenu(R.menu.menu_toolbar)
        binding.bottomNavView.inflateMenu(R.menu.menu_bottom_nav_bar)

        //取得NavController
        val navHostFragment = binding.fragmentContainerView.getFragment<NavHostFragment>()
        val navController = navHostFragment.findNavController()

        //取得appBarConfiguration
        val builder = AppBarConfiguration.Builder(navController.graph)
        val appBarConfiguration = builder.build()

        //將bottomNavigationView和NavController關聯
        binding.materialToolbar.setupWithNavController(navController, appBarConfiguration)
        binding.bottomNavView.setupWithNavController(navController)
    }
}