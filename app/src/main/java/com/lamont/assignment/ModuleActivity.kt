package com.lamont.assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView


class ModuleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_module)

        //Bottom Navigation Bar
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_nav)
        val navController = findNavController(R.id.main_fragment)
        bottomNavigationView.setupWithNavController(navController)

        //Sorry

    }
}