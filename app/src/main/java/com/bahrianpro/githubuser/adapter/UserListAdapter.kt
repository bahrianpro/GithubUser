package com.bahrianpro.githubuser.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bahrianpro.githubuser.R
import com.bahrianpro.githubuser.model.UserList

class UserListAdapter (private val userList:ArrayList<UserList>) :
    RecyclerView.Adapter<UserListAdapter.ListUserViewHolder>() {

    var onItemClick : ((UserList) -> Unit)? = null

    class ListUserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imgAvatar : ImageView = itemView.findViewById(R.id.img_avatar)
        val txtUsername : TextView = itemView.findViewById(R.id.txt_username)
        val txtName : TextView = itemView.findViewById(R.id.txt_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListUserViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_user_list, parent, false)
        return ListUserViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListUserViewHolder, position: Int) {
        val dataUser = userList[position]
        holder.imgAvatar.setImageResource(dataUser.avatares)
        holder.txtUsername.text = dataUser.username
        holder.txtName.text = dataUser.name

        holder.itemView.setOnClickListener() {
            onItemClick?.invoke(dataUser)
        }
    }

    override fun getItemCount(): Int {
        return userList.size
    }
}