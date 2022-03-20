package com.lamont.assignment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.firestore.*
import com.lamont.assignment.adapter.RequestAdapter
import com.lamont.assignment.data.RequestSource
import com.lamont.assignment.databinding.FragmentWhiteFlagBinding

class WhiteFlag : Fragment() {
    private lateinit var requestRecyclerView: RecyclerView
    private var _binding: FragmentWhiteFlagBinding? = null
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentWhiteFlagBinding.inflate(inflater, container, false)
        val view = binding.root
        val requestDataset = RequestSource().loadRequests()
        val recyclerView = binding.requestRecycler
        recyclerView.adapter = RequestAdapter(requireContext(), requestDataset)

        // Inflate the layout for this fragment
        return view
    }
}