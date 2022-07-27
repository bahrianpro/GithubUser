package com.bahrianpro.githubuser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bahrianpro.githubuser.model.UserList

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val dtUser = intent.getParcelableExtra<UserList>("dataUser")
        if (dtUser != null){
            val imgAvatar : ImageView = findViewById(R.id.img_avatar)
            val txtName : TextView = findViewById(R.id.txt_name)
            val txtLocation : TextView = findViewById(R.id.txt_location)

            imgAvatar.setImageResource(dtUser.avatares)
            txtName.text = dtUser.name
            txtLocation.text = dtUser.location
        }
    }
}