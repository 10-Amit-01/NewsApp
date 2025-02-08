package com.example.newsapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.newsapp.Model.Newsitem

class HomeAdapter(val data : ArrayList<Newsitem>) : Adapter<HomeAdapter.ViewHolder>(){
    class ViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val newsTitle = view.findViewById<TextView>(R.id.newsTitle)
        val newsDescription = view.findViewById<TextView>(R.id.newsDesc)
        val newsImage = view.findViewById<ImageView>(R.id.newsImage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.single_row_home_recyler_view, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val curr = data[position]
        holder.newsTitle.text = curr.newsTitle
        holder.newsDescription.text = curr.newsDesc
        holder.newsImage.setImageResource(curr.newsImage)

    }
}