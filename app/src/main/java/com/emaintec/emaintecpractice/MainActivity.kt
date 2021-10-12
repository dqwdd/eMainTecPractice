package com.emaintec.emaintecpractice

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.view.Menu
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

    private val fragmentOne by lazy { CheckFragment() }
    private val fragmentTwo by lazy { RequestAcceptFragment() }
    private val fragmentThree by lazy { RequestWorkFragment() }
    private val fragmentFour by lazy { SettingFragment() }


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

        binding.naviBarBottom.setOnItemSelectedListener { item ->
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


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.bottom_navigation_items,menu)

        // change menu text color programmatically
        menu?.apply {
            for(index in 0 until this.size()){
                val item = this.getItem(index)
                val s = SpannableString(item.title)
                s.setSpan(ForegroundColorSpan(Color.BLACK),0,s.length,0)
                item.title = s
            }
        }
        return super.onCreateOptionsMenu(menu)
    }


    private fun replaceFragment(fragment: Fragment){
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.mainFrameLayout, fragment)
        fragmentTransaction.commit()
    }


}