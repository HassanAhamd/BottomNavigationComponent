package com.gtaskmanager.bottomnavigationpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        val navController = Navigation.findNavController(this, R.id.nav_hostFragment)

        val appBarConfiguration = AppBarConfiguration(setOf(R.id.firstFragment,R.id.secondFragment,R.id.thirdFragment))

        setupActionBarWithNavController(navController,appBarConfiguration)

        bottomNavigationView.setupWithNavController(navController)

    }
}