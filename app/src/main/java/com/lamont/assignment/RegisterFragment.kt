package com.lamont.assignment

import android.app.DatePickerDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.google.firebase.firestore.FirebaseFirestore
import com.lamont.assignment.databinding.FragmentRegisterBinding
import java.util.*
import kotlin.system.exitProcess


class RegisterFragment : Fragment(){

    private var _binding: FragmentRegisterBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRegisterBinding.inflate(inflater, container, false)

        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.loginButton.setOnClickListener {
            val navController = findNavController()
            navController.navigate(R.id.loginFragment)
        }

        binding.registerButton.setOnClickListener {
            val username = binding.etUsername.text.toString()
            val email = binding.etEmail.text.toString()
            val password = binding.etPassword.text.toString()
            val conPassword = binding.etConPassword.text.toString()
            val phone = binding.etPhone.text.toString()
            val birthdate = binding.etDob.text.toString()

            if(username != "" && email != "" && password != "" && conPassword != "" && phone != "" && birthdate != "") {
                if (checkUserExists(username, email, phone)) {
                    Toast.makeText(requireContext(), "Validated", Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(requireContext(), "User Existed", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(requireContext(), "Invalid", Toast.LENGTH_SHORT).show()
            }


        }

        val systemCal = Calendar.getInstance()
        val year = systemCal.get(Calendar.YEAR)
        val month = systemCal.get(Calendar.MONTH)
        val day = systemCal.get(Calendar.DAY_OF_MONTH)

        binding.etDob.setOnClickListener {
            DatePickerDialog(requireContext(), DatePickerDialog.OnDateSetListener{ view, mYear, mMonth, mDay ->
                binding.etDob.setText("$mDay/$mMonth/$mYear")
            }, year, month, day).show()
        }
    }

    fun checkUserExists(username:String, email:String, phone:String): Boolean {
        val db = FirebaseFirestore.getInstance()
        var valid: Boolean = false
        db.collection("users")
            .whereEqualTo("username", username)
            .get()
            .addOnSuccessListener {
                if (it.isEmpty){
                    valid = true
                    Toast.makeText(requireContext(), "{$valid}", Toast.LENGTH_SHORT).show()
                }
            }
        if (valid == true){
            Toast.makeText(requireContext(), "asdsadasd", Toast.LENGTH_SHORT).show()
        }
        return valid
    }

}