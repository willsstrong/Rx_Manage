package com.example.rxmanage

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row_card.view.*

class CardListAdaptor(private val rxDat: List<RxCardData>, private val rxCardClicked: () -> Unit) :
    RecyclerView.Adapter<CardListAdaptor.ViewHolder>() {  //pass in array of rxdata
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_card, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = rxDat.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val rx = rxDat[position]
        holder.view.rxDataName.text = "${rx.medName}"
        holder.view.rxDataDesc.text = "${rx.medDesc}"
        holder.view.setOnClickListener { rxCardClicked.invoke() }
    }

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view)
}