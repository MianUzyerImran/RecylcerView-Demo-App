package com.example.recyclerdemoapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintSet
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter:RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
    val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout,parent,false)
        return ViewHolder(v)
    }

private var title = arrayOf(
    "Life Quote",
    "Travel Quote",
    "Love Quote",
    "Programming Quote",
    "Business Quote",
    "Gym Quote",
    "Food Quote",
    "History Quote")
private var details = arrayOf(
    "You will face many defeats in life, but never let yourself be defeated & " +
            "The greatest glory in living lies not in never falling ",
    "“Remember that happiness is a way of travel, not a destination.”",
    "Love is the greatest power in existence. Its presence can be deeply felt wherever it resides." +
            " Love can overcome everything and can magnificently transform intricate situations to the better.",
    "Programming is Love",
    "There are no secrets to success. It is the result of preparation, hard work, and learning from failure",
    "“To keep the body in good health is a duty… otherwise we shall not be able to keep our mind strong and clear.",
    "“A recipe has no soul. You, as the cook, must bring soul to the recipe– Thomas Keller",
    "A generation which ignores history has no past and no future")
private var images = intArrayOf(
    R.drawable.image,
    R.drawable.image2,
    R.drawable.image3,
    R.drawable.image4,
    R.drawable.image5,
    R.drawable.image6,
    R.drawable.image7,
    R.drawable.image8,)

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {

        holder.itemTitle.text = title[position]
        holder.itemDetail.text = details[position]
        holder.itemImage.setImageResource(images[position])
    }

    override fun getItemCount(): Int {
        return title.size
    }


    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var itemImage : ImageView
        var itemTitle : TextView
        var itemDetail : TextView

        init {
            itemImage= itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_detail)

            itemView.setOnClickListener {
                Toast.makeText(itemView.context, "This is Done by UzairImran", Toast.LENGTH_SHORT).show()
            }
        }
    }
}