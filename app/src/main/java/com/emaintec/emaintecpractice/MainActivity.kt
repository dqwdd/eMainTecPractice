package com.emaintec.emaintecpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RelativeLayout
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.emaintec.emaintecpractice.adapter.MainViewPagerAdapter
import com.emaintec.emaintecpractice.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {

    lateinit var binding: ActivityMainBinding

    val mainViewModel : MainViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.lifecycleOwner = this
        binding.viewModel = mainViewModel

        setupEvent()
        setValues()
        configureBottomNavigation()
    }

    override fun setupEvent() {
    }

    override fun setValues() {
    }


    private fun configureBottomNavigation(){
        binding.mainViewPager2.adapter = MainViewPagerAdapter(getIdolList()) // 어댑터 생성
        binding.mainBottomMenu.setupWithViewPager(binding.mainViewPager2)

        val bottomNaviLayout: View = this.layoutInflater.inflate(R.layout.bottom_navigation_tab, null, false)

        binding.mainBottomMenu.getTabAt(0)!!.customView = bottomNaviLayout.findViewById(R.id.bottomCheckTab) as RelativeLayout
        binding.mainBottomMenu.getTabAt(1)!!.customView = bottomNaviLayout.findViewById(R.id.bottomRequestWorkTab) as RelativeLayout
        binding.mainBottomMenu.getTabAt(2)!!.customView = bottomNaviLayout.findViewById(R.id.bottomRequestAcceptTab) as RelativeLayout
        binding.mainBottomMenu.getTabAt(3)!!.customView = bottomNaviLayout.findViewById(R.id.bottomSettingTab) as RelativeLayout
    }

}