package com.bahrianpro.githubuser.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bahrianpro.githubuser.R
import com.bahrianpro.githubuser.model.UserList

class UserListAdapter (private val userList:ArrayList<UserList>) :
    RecyclerView.Adapter<UserListAdapter.ListUserViewHolder>() {

    class ListUserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imgAvatar : ImageView = itemView.findViewById(R.id.img_avatar)
        val txtUsername : TextView = itemView.findViewById(R.id.txt_username)
        val txtPerusahaan : TextView = itemView.findViewById(R.id.txt_perusahaan)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListUserViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_user_list, parent, false)
        return ListUserViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListUserViewHolder, position: Int) {
        val (username, company, avatares) = userList[position]
        holder.imgAvatar.setImageResource(avatares.toInt())
        holder.txtUsername.text = username
        holder.txtPerusahaan.text = company
    }

    override fun getItemCount(): Int {
        return userList.size
    }
}