package com.emaintec.emaintecpractice.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.emaintec.emaintecpractice.main_fragment.InspactionFragment
import com.emaintec.emaintecpractice.main_fragment.RequestAcceptFragment
import com.emaintec.emaintecpractice.main_fragment.RequestWorkFragment
import com.emaintec.emaintecpractice.main_fragment.SettingFragment
import com.emaintec.emaintecpractice.main_fragment.inspection_fragment.AllInspectionFragment
import com.emaintec.emaintecpractice.main_fragment.inspection_fragment.InspectionCompleteFragment
import com.emaintec.emaintecpractice.main_fragment.inspection_fragment.UnCheckedFragment

class InspectionViewPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment =
        when (position) {
            0 -> AllInspectionFragment()
            1 -> UnCheckedFragment()
            else -> InspectionCompleteFragment()
        }
}