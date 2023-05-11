package com.eslemarik.whatsapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.content.res.AppCompatResources
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class BilgilerAdapter(val liste: ArrayList<Bilgiler>, val activity: MainActivity): RecyclerView.Adapter<BilgilerAdapter.BilgilerViewHolder>() {
        class BilgilerViewHolder(view: View) : RecyclerView.ViewHolder(view){

                var tvImageView : ImageView = view.findViewById(R.id.tv_imageView)
                val tvName: TextView = view.findViewById(R.id.tv_name)
                val tvMessage: TextView = view.findViewById(R.id.tv_message)
        }
        override fun onCreateViewHolder(
                parent: ViewGroup,
                viewType: Int
        ): BilgilerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_features,parent,false)
                return BilgilerViewHolder(view)
        }

        override fun onBindViewHolder(holder: BilgilerAdapter.BilgilerViewHolder, position: Int) {
                val tempBG = liste.get(position)

                // internet'ten URL üzerinden resim yüklemek istersen
                Glide.with(activity)
                        .load(tempBG.resim)
                        .into(holder.tvImageView)

                // örnek, eğer drawable klasöründen bir resim yüklemek istersen
                //holder.tvImageView.setImageDrawable(AppCompatResources.getDrawable(activity, R.drawable.ic_launcher_foreground))

                holder.tvName.text = tempBG.name
                holder.tvMessage.text = tempBG.message

        }

        override fun getItemCount(): Int {
                return liste.size
        }
}


