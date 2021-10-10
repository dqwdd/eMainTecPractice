package com.emaintec.emaintecpractice

import android.content.Intent
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel() : ViewModel() {


    var count = MutableLiveData<Int>()

    init {
        count.value = 0
    }

    fun alarmIntent() {
        /*
        val myIntent = Intent(mContext, LoginActivity::class.java)
        startActivity(myIntent)
        */
    }

    fun decrease() {
        count.value = count.value?.minus(1)
    }

}