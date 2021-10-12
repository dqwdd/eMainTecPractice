package com.emaintec.emaintecpractice.main_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.emaintec.emaintecpractice.R
import com.emaintec.emaintecpractice.databinding.FragmentCheckBinding


class CheckFragment : BaseFragment() {

    lateinit var binding: FragmentCheckBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_check, container, false)
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