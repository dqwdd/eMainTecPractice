package com.emaintec.emaintecpractice.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.emaintec.emaintecpractice.main_fragment.InspactionFragment
import com.emaintec.emaintecpractice.main_fragment.RequestAcceptFragment
import com.emaintec.emaintecpractice.main_fragment.RequestWorkFragment
import com.emaintec.emaintecpractice.main_fragment.SettingFragment

class InspectionViewPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 4

    override fun createFragment(position: Int): Fragment =
        when (position) {
            0 -> InspactionFragment()
            1 -> RequestAcceptFragment()
            2 -> RequestWorkFragment()
            else -> SettingFragment()
        }
}