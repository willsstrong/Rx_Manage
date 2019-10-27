package com.example.rxmanage

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row_card.view.*

class CardListAdaptor(private val rxDat: List<RxCardData>) : RecyclerView.Adapter<CardListAdaptor.ViewHolder>() {  //pass in array of rxdata
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_card, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = rxDat.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val rx = rxDat[position]
        holder.view.rxDataName.text = "${rx.medName}"
        holder.view.rxDataDesc.text = "${rx.medDesc}"
    }

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view)
}

/////  Code for Creating CardView
//        val mainLinearLayout = holder.view.cardListRow
//        val cardLinearLayout = LinearLayout(this)
//
//        cardLinearLayout.orientation = LinearLayout.VERTICAL
//        val params = RelativeLayout.LayoutParams(
//            ViewGroup.LayoutParams.MATCH_PARENT,
//            ViewGroup.LayoutParams.WRAP_CONTENT
//        )
//        params.setMargins(50,40,50,0)
//        params.height = 700
//        //Set Card Parameters
//        val cardView = CardView(this)
//        cardView.radius = 30f
//        cardView.setCardBackgroundColor(Color.parseColor("#B2F3DE"))
//        cardView.setContentPadding(36,36,36,36)
//        cardView.layoutParams = params
//        cardView.cardElevation = 0f
//        //Set TextView Parameters
//        val cardData = TextView(this)
//        cardData.text = data
//        cardData.setTextColor(Color.BLACK)
//        cardData.setTypeface(Typeface.SANS_SERIF, Typeface.NORMAL)
//        //Add card and child elements to Layout
//        cardLinearLayout.addView(cardData)
//        cardView.addView(cardLinearLayout)
//        mainLinearLayout.addView(cardView)