package com.lamont.assignment

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch


class ModuleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_module)

        //Bottom Navigation Bar
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_nav)
        val navController = findNavController(R.id.main_fragment)
        bottomNavigationView.setupWithNavController(navController)

        //Coroutine to check latest password
//        CoroutineScope(IO).launch {
//            val sharedPreferences = getSharedPreferences("SHARE_PREF", Context.MODE_PRIVATE)
//            val db = FirebaseFirestore.getInstance()
//            var username = sharedPreferences!!.getString("username", null)
//            var password = sharedPreferences!!.getString("password", null)
//            db.collection("users")
//                .document(username!!)
//                .get()
//                .addOnSuccessListener { document ->
//                    if(document.data?.get("password") != password) {
//                        val intent = Intent(applicationContext, MainActivity::class.java)
//                        startActivity(intent)
//                        finish()
//                    }
//                }
//        }
    }
}