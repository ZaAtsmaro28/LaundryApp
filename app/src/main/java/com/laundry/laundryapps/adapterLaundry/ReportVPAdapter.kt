package com.laundry.laundryapps.adapterLaundry

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.laundry.laundryapps.pageView.IncomeFragment
import com.laundry.laundryapps.pageView.LabaRugiFragment
import com.laundry.laundryapps.pageView.OutcomeFragment

class ReportVPAdapter(fm : FragmentManager, lc : Lifecycle) : FragmentStateAdapter(fm, lc) {
    //jumlah fragment pada tab layout
    override fun getItemCount(): Int = 3

    //penempatan frg pada tiap section
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> LabaRugiFragment()
            1 -> IncomeFragment()
            2 -> OutcomeFragment()
            else -> throw IllegalArgumentException("Invalid position: $position")
        }
    }

}