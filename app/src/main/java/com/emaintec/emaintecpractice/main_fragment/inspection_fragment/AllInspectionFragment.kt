package com.emaintec.emaintecpractice.main_fragment.inspection_fragment

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.emaintec.emaintecpractice.R
import com.emaintec.emaintecpractice.databinding.FragmentAllInspectionBinding
import com.emaintec.emaintecpractice.main_fragment.BaseFragment
import java.text.SimpleDateFormat
import java.util.*

class AllInspectionFragment : BaseFragment() {

    val mSelectedDateTime = Calendar.getInstance()


    lateinit var binding: FragmentAllInspectionBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_all_inspection, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {
        dateSelectfirstDateText()
        dateSelectsecondDateText()
    }

    override fun setValues() {
    }



    fun dateSelectfirstDateText() {
        binding.firstDateText.setOnClickListener {
            val dateSetListener =
                DatePickerDialog.OnDateSetListener { datePicker, year, month, day ->
                    mSelectedDateTime.set(year, month, day)
                    binding.firstDateText.text =
                        SimpleDateFormat("yyyy. M. d HH:mm").format(mSelectedDateTime.time)
                }
            DatePickerDialog(
                mContext,
                dateSetListener,
                mSelectedDateTime.get(Calendar.YEAR),
                mSelectedDateTime.get(Calendar.MONTH),
                mSelectedDateTime.get(Calendar.DAY_OF_MONTH)
            ).show()
        }
    }



    fun dateSelectsecondDateText() {
        binding.secondDateText.setOnClickListener {
            val dateSetListener =
                DatePickerDialog.OnDateSetListener { datePicker, year, month, day ->
                    mSelectedDateTime.set(year, month, day)
                    binding.secondDateText.text =
                        SimpleDateFormat("yyyy. M. d").format(mSelectedDateTime.time)
                }
            DatePickerDialog(
                mContext,
                dateSetListener,
                mSelectedDateTime.get(Calendar.YEAR),
                mSelectedDateTime.get(Calendar.MONTH),
                mSelectedDateTime.get(Calendar.DAY_OF_MONTH)
            ).show()
        }
    }


}