package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MarketAdapter(val markList:List<Result>):RecyclerView.Adapter<MarketAdapter.ViewHolder> () {

    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        fun bind(market: Result){
            val tvMarketC = itemView.findViewById<TextView>(R.id.tv_marketc)
            val tvBase = itemView.findViewById<TextView>(R.id.tv_basec)

            tvMarketC.text = market.MarketCurrency
            tvBase.text = market.BaseCurrency
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.bittrex_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return markList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(markList[position])
    }
}
