package com.laundry.laundryapps.pageView

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.laundry.laundryapps.R
import com.laundry.laundryapps.adapterLaundry.AdapterFeatures
import com.laundry.laundryapps.databinding.FragmentHomeBinding
import com.laundry.laundryapps.model.FeaturesModel

class HomeFragment : Fragment() {
    private var binding : FragmentHomeBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val list = view.findViewById<RecyclerView>(R.id.list_features)



        list.adapter = adapterFeatures

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

        private val adapterFeatures by lazy {
            val items = listOf<FeaturesModel>(
                FeaturesModel("Buat Pesanan", R.drawable.add_order_icon),
                FeaturesModel("Pelanggan", R.drawable.customer_icon),
                FeaturesModel("Layanan", R.drawable.service_icon),
                FeaturesModel("Pengeluaran", R.drawable.pay_icon),
                FeaturesModel("Scan QR", R.drawable.qr_icon),
                FeaturesModel("Metode Pembayaran", R.drawable.payment_method_icon),
                FeaturesModel("Pesanan Dibatalkan", R.drawable.cancel_order_icon)

            )
            AdapterFeatures(items, object : AdapterFeatures.AdapterListener{
                override fun onClick(feature: FeaturesModel) {
                    Toast.makeText(activity, "test!", Toast.LENGTH_LONG).show()
                }

            }, activity)
        }

}