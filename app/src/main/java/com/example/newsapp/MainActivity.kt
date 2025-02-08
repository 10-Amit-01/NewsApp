package com.example.newsapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.homeNavbar)
        openHomeFragment()
        bottomNavigationView.setOnItemSelectedListener { item ->
            when(item.itemId) {
                R.id.home -> {
                    openHomeFragment()
                }
                R.id.bookmark -> {
                    Toast.makeText(this, "Bookmark", Toast.LENGTH_SHORT).show()
                }
            }
            true
        }
    }

    private fun openHomeFragment() {
        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, HomeFragment()).commit()
    }
}