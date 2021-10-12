package com.emaintec.emaintecpractice.main_fragment.inspection_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.emaintec.emaintecpractice.R
import com.emaintec.emaintecpractice.databinding.FragmentInspectionCompleteBinding
import com.emaintec.emaintecpractice.main_fragment.BaseFragment

class InspectionCompleteFragment : BaseFragment() {

    lateinit var binding: FragmentInspectionCompleteBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_inspection_complete, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {
    }

    override fun setValues() {
    }

}