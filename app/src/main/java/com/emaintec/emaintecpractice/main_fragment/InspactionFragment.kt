package com.emaintec.emaintecpractice.main_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.emaintec.emaintecpractice.R
import com.emaintec.emaintecpractice.adapter.InspectionViewPagerAdapter
import com.emaintec.emaintecpractice.databinding.FragmentInspectionBinding
import com.google.android.material.tabs.TabLayoutMediator


class InspactionFragment : BaseFragment() {

    lateinit var binding: FragmentInspectionBinding

    lateinit var mAdapter: InspectionViewPagerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_inspection, container, false)
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

        binding.viewPager2Inspection.adapter = InspectionViewPagerAdapter(this)

        TabLayoutMediator(binding.tabLayoutInspection, binding.viewPager2Inspection) { tab, position ->
            when(position){
                0-> tab.text = "전체"
                1-> tab.text = "미점검"
                else-> tab.text = "점검완료"
            }
        }.attach()

    }


}