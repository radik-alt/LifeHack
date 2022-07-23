package com.example.tz_meidasoft.presentation.adapter.AdapterToday

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tz_meidasoft.R

class AdapterTodayNextDays(val list: ArrayList<String>) : RecyclerView.Adapter<AdapterNextViewHolder>() {

    private lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterNextViewHolder {
        context = parent.context
        val view = LayoutInflater.from(context).inflate(R.layout.weather_three, parent, false)
        return AdapterNextViewHolder(view)
    }

    override fun onBindViewHolder(holder: AdapterNextViewHolder, position: Int) {

        holder.day.text = list[position]

    }

    override fun getItemCount(): Int = list.size
}