package com.example.tigapuluhharisehat

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.tigapuluhharisehat.model.ChatMessage

class ChatAdapter(private val chatList: List<ChatMessage>) :
    RecyclerView.Adapter<ChatAdapter.ChatViewHolder>() {

    inner class ChatViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtSender: TextView = itemView.findViewById(R.id.txtSender)
        val txtMessage: TextView = itemView.findViewById(R.id.txtMessage)
        val txtTime: TextView = itemView.findViewById(R.id.txtTime)

        init {
            itemView.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    val chat = chatList[position]
                    val toastText = "${chat.sender} bilang: \"${chat.message}\""
                    Toast.makeText(itemView.context, toastText, Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_chat, parent, false)
        return ChatViewHolder(view)
    }

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
        val chat = chatList[position]
        holder.txtSender.text = chat.sender
        holder.txtMessage.text = chat.message
        holder.txtTime.text = chat.time
    }

    override fun getItemCount(): Int = chatList.size
}
