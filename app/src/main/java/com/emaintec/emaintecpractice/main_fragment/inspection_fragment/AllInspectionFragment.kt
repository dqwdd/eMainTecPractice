package com.emaintec.emaintecpractice.main_fragment.inspection_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.emaintec.emaintecpractice.R
import com.emaintec.emaintecpractice.databinding.FragmentAllInspectionBinding
import com.emaintec.emaintecpractice.main_fragment.BaseFragment

class AllInspectionFragment : BaseFragment() {

    lateinit var binding: FragmentAllInspectionBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_all_inspection, container, false)
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