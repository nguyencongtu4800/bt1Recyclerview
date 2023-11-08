package com.example.btrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class RecyclerviewAdapter(val items: ArrayList<MainActivity.Email>): RecyclerView.Adapter<RecyclerviewAdapter.recyclerviewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): recyclerviewHolder{
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_custom, parent, false)
        return recyclerviewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: recyclerviewHolder, p0: Int) {
        holder.imagethum.setImageResource(items[p0].iconthumbnail)
        holder.itemsubject.text = items[p0].subject
        holder.itemdecription.text = items[p0].description
        holder.itemtime.text = items[p0].time
    }
    class recyclerviewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        val imagethum: ImageView
        val itemsubject: TextView
        val itemdecription: TextView
        val itemtime: TextView
        val itemstar: ImageView
        init {

            imagethum = itemView.findViewById(R.id.image_thumb)
            itemsubject = itemView.findViewById(R.id.item_Subject)
            itemdecription = itemView.findViewById(R.id.item_noidung)
            itemtime = itemView.findViewById(R.id.item_time)
            itemstar = itemView.findViewById(R.id.item_star)
        }

    }
}
