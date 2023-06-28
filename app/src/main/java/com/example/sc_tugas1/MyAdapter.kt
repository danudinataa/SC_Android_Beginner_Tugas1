package com.example.sc_tugas1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.sc_tugas1.databinding.FragmentItemBinding

class MyAdapter : RecyclerView.Adapter<MyAdapter.CustomViewHolder>() {

    private var listItem = ArrayList<AnimeList>()

    inner class CustomViewHolder(private val binding: FragmentItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(data : AnimeList) {
            with(binding) {
                tvHeading.text = data.heading
                Glide.with(itemView.context).load(data.image).into(titleImage)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder =
        CustomViewHolder(
            FragmentItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.bind(listItem[position])
    }

    override fun getItemCount(): Int = listItem.size

    fun setListItem(list: ArrayList<AnimeList>) {
        listItem.clear()
        listItem.addAll(list)
    }

}