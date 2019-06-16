package com.example.tapp2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.animals_list.view.*

class AnimalsAdapter(val mCtx : Context, val animals : ArrayList<String>) : RecyclerView.Adapter<AnimalsAdapter.AnimalsViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalsViewHolder {
        return AnimalsViewHolder(LayoutInflater.from(mCtx).inflate(R.layout.animals_list, parent, false))
    }

    override fun getItemCount(): Int {
        return animals.size
    }

    override fun onBindViewHolder(holder: AnimalsViewHolder, position: Int) {
        holder?.animal?.text = animals.get(position)
    }

    class AnimalsViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val animal = view.animal
    }
}