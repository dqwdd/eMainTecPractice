package com.emaintec.emaintecpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RelativeLayout
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.emaintec.emaintecpractice.databinding.ActivityMainBinding
import com.emaintec.emaintecpractice.main_fragment.CheckFragment
import com.emaintec.emaintecpractice.main_fragment.RequestAcceptFragment
import com.emaintec.emaintecpractice.main_fragment.RequestWorkFragment
import com.emaintec.emaintecpractice.main_fragment.SettingFragment

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
    }

    override fun setupEvent() {
    }

    override fun setValues() {

        replaceFragment(CheckFragment())

        binding.navBarBottom.setOnItemSelectedListener { item ->
            when(item.itemId){
                R.id.bottomCheckTab -> replaceFragment(CheckFragment())
                R.id.bottomRequestWorkTab -> replaceFragment(RequestAcceptFragment())
                R.id.bottomRequestAcceptTab -> replaceFragment(RequestWorkFragment())
                R.id.bottomSettingTab -> replaceFragment(SettingFragment())
                else -> { }
            }
            true
        }

    }

    private fun replaceFragment(fragment: Fragment){
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout_main, fragment)
        fragmentTransaction.commit()
    }


}