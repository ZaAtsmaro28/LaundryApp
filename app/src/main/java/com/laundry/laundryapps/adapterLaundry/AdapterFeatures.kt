package com.laundry.laundryapps.adapterLaundry

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.laundry.laundryapps.R
import com.laundry.laundryapps.model.FeaturesModel


class AdapterFeatures(
    var items : List<FeaturesModel>,
    var listener : AdapterListener,
    var context : Activity?
): RecyclerView.Adapter<AdapterFeatures.ViewHolder>(){

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val image = itemView.findViewById<ImageView>(R.id.icon_feature)
        val name = itemView.findViewById<TextView>(R.id.feature_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.adapter_features, parent, false)
    )

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.image.setImageResource(item.image)
        holder.name.text = item.name
        holder.itemView.setOnClickListener{
            listener.onClick(item)
        }
    }

    interface AdapterListener {
        fun onClick(feature : FeaturesModel)
    }

}