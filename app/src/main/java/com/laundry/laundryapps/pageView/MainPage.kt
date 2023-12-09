package com.laundry.laundryapps.pageView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.laundry.laundryapps.R
import com.qamar.curvedbottomnaviagtion.CurvedBottomNavigation

class MainPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_page)

        //default page


        val bottomNav = findViewById<CurvedBottomNavigation>(R.id.bottomNavigation)

        bottomNav.add(
            CurvedBottomNavigation.Model(1, "Beranda", R.drawable.home_icon)
        )
        bottomNav.add(
            CurvedBottomNavigation.Model(2, "Pesanan", R.drawable.order_icon)

        )
        bottomNav.add(
            CurvedBottomNavigation.Model(3, "Laporan", R.drawable.report_icon)

        )
//        bottomNav.add(
//            CurvedBottomNavigation.Model(4, "Pengaturan", R.drawable.settings_icon)
//
//        )




        bottomNav.setOnClickMenuListener {
            when(it.id){
                1 -> {replaceFragment(HomeFragment())}
                2 -> {replaceFragment(OrderFragment())}
                3 -> {replaceFragment(ReportFragment())}
//                4 -> {replaceFragment(SettingsFragment())}
            }
        }
        replaceFragment(HomeFragment())
        bottomNav.show(1)

    }
        private fun replaceFragment(f : Fragment){
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.pageContainer, f)
                .commit()
        }
}