package com.example.tigapuluhharisehat

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MakananAdapter(
    private val context: Context,
    private val makananList: List<MakananSehat>,
    private val onItemClick: (MakananSehat) -> Unit
) : RecyclerView.Adapter<MakananAdapter.MakananViewHolder>() {

    inner class MakananViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgMakanan: ImageView = itemView.findViewById(R.id.imgMakanan)
        val txtNama: TextView = itemView.findViewById(R.id.txtNama)
        val txtManfaat: TextView = itemView.findViewById(R.id.txtManfaat)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MakananViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_makanan, parent, false)
        return MakananViewHolder(view)
    }

    override fun onBindViewHolder(holder: MakananViewHolder, position: Int) {
        val makanan = makananList[position]
        holder.imgMakanan.setImageResource(makanan.gambarResId)
        holder.txtNama.text = makanan.nama
        holder.txtManfaat.text = makanan.manfaat

        holder.itemView.setOnClickListener {
            onItemClick(makanan)
        }
    }

    override fun getItemCount(): Int = makananList.size
}
