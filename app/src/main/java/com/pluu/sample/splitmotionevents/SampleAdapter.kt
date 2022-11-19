package com.pluu.sample.splitmotionevents

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pluu.sample.splitmotionevents.databinding.ItemSampleBinding

class SampleAdapter : RecyclerView.Adapter<SampleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SampleViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return SampleViewHolder(
            ItemSampleBinding.inflate(layoutInflater, parent, false)
        )
    }

    override fun onBindViewHolder(holder: SampleViewHolder, position: Int) {
        holder.onBind()
    }

    override fun getItemCount(): Int = 30
}

class SampleViewHolder(
    private val binding: ItemSampleBinding
) : RecyclerView.ViewHolder(binding.root) {
    fun onBind() {
        binding.tvIndex.text = "Index ${bindingAdapterPosition}"
    }
}