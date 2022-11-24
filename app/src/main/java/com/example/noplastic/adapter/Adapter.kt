package com.example.noplastic.adapter
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import com.example.noplastic.InformacionPlasticos.Plastico
import com.example.noplastic.R

class Adapter(private val plasticoList:List<Plastico>): RecyclerView.Adapter<viewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val layoutInflater=LayoutInflater.from(parent.context)
        return viewHolder(layoutInflater.inflate(R.layout.tipos_plasticos,parent, false))
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        val animation:Animation= AnimationUtils.loadAnimation(holder.itemView.context, android.R.anim.slide_in_left)
        val item=plasticoList[position]
        holder.itemView.startAnimation(animation)
        holder.render(item)
    }

    override fun getItemCount(): Int {
        return plasticoList.size
    }
}