package com.lamont.assignment

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.PopupMenu
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.firebase.firestore.FirebaseFirestore
import com.lamont.assignment.databinding.ActivityMainBinding
import com.lamont.assignment.databinding.ActivityModuleBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch
import kotlin.coroutines.coroutineContext


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

    fun popupMenu(view: View) {
        val popupMenu = PopupMenu(applicationContext, findViewById(R.id.bottom_nav))
        popupMenu.inflate(R.menu.popup_menu)
        popupMenu.show()
    }

}