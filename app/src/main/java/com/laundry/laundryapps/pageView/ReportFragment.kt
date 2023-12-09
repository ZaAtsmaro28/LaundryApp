package com.laundry.laundryapps.pageView

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.tabs.TabLayoutMediator
import com.laundry.laundryapps.R
import com.laundry.laundryapps.adapterLaundry.ReportVPAdapter
import com.laundry.laundryapps.databinding.FragmentReportBinding

class ReportFragment : Fragment() {

    private lateinit var VPadapter : ReportVPAdapter
    private lateinit var binding: FragmentReportBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        val view = inflater.inflate(R.layout.fragment_report, container, false)
        binding = FragmentReportBinding.inflate(inflater, container, false)
        VPadapter = ReportVPAdapter(parentFragmentManager, lifecycle)

        with(binding){
            reportContainer.adapter = VPadapter

            TabLayoutMediator(reportTabLayout, reportContainer){tab, position ->
                when(position){
                    0 -> tab.text = "Laba-Rugi"
                    1 -> tab.text = "Pemasukan"
                    2 -> tab.text = "Pengeluaran"
                }
            }.attach()
        }

        return binding.root
    }


}