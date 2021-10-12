package com.emaintec.emaintecpractice.main_fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.emaintec.emaintecpractice.R

abstract class BaseFragment : Fragment() {

    lateinit var mContext: Context

    lateinit var txtTitle: TextView

    // 뷰가 그려지는 시기
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setCustomActionBar()
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    // 그려진 뷰에 데이터를 Set
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mContext = requireContext()
        setCustomActionBar()
    }

    abstract fun setupEvents()
    abstract fun setValues()

    private fun setCustomActionBar() {
        val defActionBar = (requireActivity() as AppCompatActivity).supportActionBar!!

        defActionBar.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
        defActionBar.setCustomView(R.layout.custom_action_bar)
        //defActionBar.elevation = 0F

        txtTitle = defActionBar.customView.findViewById(R.id.txt_title)
    }

}