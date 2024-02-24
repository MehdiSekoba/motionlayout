package com.mehdisekoba.motionlayout.ui.main.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.mehdisekoba.motionlayout.data.ImageData
import com.mehdisekoba.motionlayout.databinding.ImageItemBinding

class ImageDataAdapter(private var context: Context, private val imageDataList: List<ImageData>) :
    RecyclerView.Adapter<ImageDataAdapter.ImageDataViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): ImageDataViewHolder {
        val binding = ImageItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        context = parent.context
        return ImageDataViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: ImageDataViewHolder,
        position: Int,
    ) = holder.bind(imageDataList[position])

    override fun getItemCount() = imageDataList.size

    inner class ImageDataViewHolder(private val binding: ImageItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: ImageData) {
            //  initView
            binding.apply {
                itemImg.load(item.remoteImageUrl)
                txtName.text = item.name
                txtLocation.text = item.location
                txtDescription.text = item.description
                // Click
                motionParent.setOnClickListener {
                    onItemClickListener?.let {
                        it("${item.id}", item)
                    }
                }
            }
        }
    }

    private var onItemClickListener: ((String, ImageData) -> Unit)? = null

    fun setOnItemClickListener(listener: (String, ImageData) -> Unit) {
        onItemClickListener = listener
    }
}
