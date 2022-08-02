package com.bahrianpro.githubuser.model

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bahrianpro.githubuser.R

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val dtUser = intent.getParcelableExtra<UserList>("dataUser")
        if (dtUser != null){
            val imgAvatar : ImageView = findViewById(R.id.img_avatar)
            val txtUsername : TextView = findViewById(R.id.txt_username)
            val txtName : TextView = findViewById(R.id.txt_name)
            val txtCompany : TextView = findViewById(R.id.txt_company)
            val txtLocation : TextView = findViewById(R.id.txt_location)
            val txtRepository : TextView = findViewById(R.id.txt_repository)
            val txtFollowers : TextView = findViewById(R.id.txt_followers)
            val txtFollowing : TextView = findViewById(R.id.txt_following)

            imgAvatar.setImageResource(dtUser.avatares)
            txtUsername.text = "( " + dtUser.username +" )"
            txtName.text = dtUser.name
            txtCompany.text = dtUser.company
            txtLocation.text = dtUser.location
            txtRepository.text = dtUser.repository
            txtFollowers.text = dtUser.followers
            txtFollowing.text = dtUser.following
        }
    }
}