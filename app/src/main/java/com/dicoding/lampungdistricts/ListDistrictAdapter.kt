package com.dicoding.lampungdistricts

import android.content.Intent
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import java.util.*

class ListDistrictAdapter(private val listDistricts: ArrayList<District>) : RecyclerView.Adapter<ListDistrictAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_district, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val district = listDistricts[position]

        Glide.with(holder.itemView.context)
                .load(district.logo)
                .apply(RequestOptions().override(55, 55))
                .into(holder.imgLogo)

        holder.tvName.text = district.name
        holder.tvDetail.text = district.detail

        holder.itemView.setOnClickListener {
            val context = holder.tvName.context
            val intent = Intent(context, DistrictDetail::class.java)
            intent.putExtra(DistrictDetail.EXTRA_NAME,
                    district.name)
            intent.putExtra(DistrictDetail.EXTRA_DETAIL,
                    district.detail)
            intent.putExtra(DistrictDetail.EXTRA_LOGO,
                    district.logo)
            context.startActivity(intent)
        }
    }


    override fun getItemCount(): Int {
        return listDistricts.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgLogo: ImageView = itemView.findViewById(R.id.img_item_logo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)

    }

    interface OnItemClickCallback {
        fun onItemClicked(data: District)
    }
}