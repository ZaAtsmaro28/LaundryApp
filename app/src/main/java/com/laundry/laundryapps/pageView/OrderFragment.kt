package com.laundry.laundryapps.pageView

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import com.laundry.laundryapps.R

class OrderFragment : Fragment() {
    private lateinit var filterBtn : ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_order, container, false)
        filterBtn = view.findViewById(R.id.filter_button)
        filterBtn.setOnClickListener {
            Toast.makeText(activity,  "this is filter?", Toast.LENGTH_LONG).show()

        }
        return view
    }


}