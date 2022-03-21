package com.lamont.assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.firebase.firestore.FirebaseFirestore


class ModuleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_module)

        //Bottom Navigation Bar
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_nav)
        val navController = findNavController(R.id.main_fragment)
        bottomNavigationView.setupWithNavController(navController)

        //Test database
        val db = FirebaseFirestore.getInstance()
        val test = hashMapOf<String, Any>(
            "test" to "testing1"
        )

        db.collection("try")
            .add(test)
            .addOnSuccessListener {
                Toast.makeText(this, "Success", Toast.LENGTH_LONG).show()
            }
            .addOnFailureListener {
                Toast.makeText(this, "Fail", Toast.LENGTH_LONG).show()
            }

    }
}