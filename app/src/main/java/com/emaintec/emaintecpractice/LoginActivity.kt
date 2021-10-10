package com.emaintec.emaintecpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.emaintec.emaintecpractice.databinding.ActivityLoginBinding
import com.emaintec.emaintecpractice.databinding.ActivityMainBinding

class LoginActivity : BaseActivity() {

    lateinit var binding: ActivityLoginBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        setupEvent()
        setValues()
    }

    override fun setupEvent() {
        binding.btnLogin.setOnClickListener {
            val myIntent = Intent(mContext, MainActivity::class.java)
            startActivity(myIntent)
            finish()
        }
    }

    override fun setValues() {
    }

}