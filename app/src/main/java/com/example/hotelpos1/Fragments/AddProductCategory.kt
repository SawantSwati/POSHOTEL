package com.example.hotelpos1.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hotelpos1.databinding.FragmentAddProductCategoryBinding


class AddProductCategory : Fragment() {

    private lateinit var binding: FragmentAddProductCategoryBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentAddProductCategoryBinding.inflate(inflater,container,false)
        return binding.root

    }
}