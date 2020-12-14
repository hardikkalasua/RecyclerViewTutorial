package com.example.recyclerviewtutorial

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyRecyclerViewAdapter(val data: ArrayList<RowItem>) :
        RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder>() {

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val rowTitle: TextView = view.findViewById(R.id.row_title)
        val rowSubtitle: TextView = view.findViewById(R.id.row_subtitle)
        val rowImage: ImageView = view.findViewById(R.id.row_image)
    }

    override fun onCreateViewHolder(
            parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
                R.layout.recycler_view_item,
                parent,
                false
        )

        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.rowTitle.text = data[position].rowTitle
        holder.rowSubtitle.text = data[position].rowSubtitle
        holder.rowImage.setImageResource(data[position].rowImage)
    }

    override fun getItemCount(): Int {
        return data.size
    }

}

