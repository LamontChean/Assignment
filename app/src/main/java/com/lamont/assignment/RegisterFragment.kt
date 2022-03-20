package com.lamont.assignment

import android.app.DatePickerDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.lamont.assignment.databinding.FragmentRegisterBinding
import java.util.*


class RegisterFragment : Fragment(){

    private var _binding: FragmentRegisterBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentRegisterBinding.inflate(inflater, container, false)
        val view = binding.root
        // Inflate the layout for this fragment
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.loginButton.setOnClickListener {
            val navController = findNavController()
            navController.navigate(R.id.loginFragment)
        }

        val systemCal = Calendar.getInstance()
        val year = systemCal.get(Calendar.YEAR)
        val month = systemCal.get(Calendar.MONTH)
        val day = systemCal.get(Calendar.DAY_OF_MONTH)

        binding.etDob.setOnClickListener {
            DatePickerDialog(requireContext(), DatePickerDialog.OnDateSetListener{view, mYear, mMonth, mDay ->
                binding.etDob.setText("$mDay/$mMonth/$mYear")
            }, year, month, day).show()
        }
    }


}