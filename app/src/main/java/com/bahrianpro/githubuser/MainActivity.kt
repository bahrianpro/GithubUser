package com.bahrianpro.githubuser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bahrianpro.githubuser.adapter.UserListAdapter
import com.bahrianpro.githubuser.model.UserList

class MainActivity : AppCompatActivity() {
    private lateinit var rvUsers: RecyclerView
    private val list = ArrayList<UserList>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvUsers = findViewById(R.id.rvUsers)
        rvUsers.setHasFixedSize(true)

        list.addAll(listUsers)
        showRecyclerList()
    }

    private val listUsers: ArrayList<UserList>
    get() {
        val dtUsername = resources.getStringArray(R.array.dt_username)
        val dtName = resources.getStringArray(R.array.dt_name)
        val dtLocation = resources.getStringArray(R.array.dt_location)
        val dtRepository = resources.getStringArray(R.array.dt_repository)
        val dtCompany = resources.getStringArray(R.array.dt_company)
        val dtFollowers = resources.getStringArray(R.array.dt_followers)
        val dtFollowing = resources.getStringArray(R.array.dt_following)
        val dtAvatares = resources.obtainTypedArray(R.array.dt_avatares)

        val listUser = ArrayList<UserList>()
        for (i in dtUsername.indices){
            val userL = UserList(
                            dtUsername[i],
                            dtName[i],
                            dtLocation[i],
                            dtRepository[i],
                            dtCompany[i],
                            dtFollowers[i],
                            dtFollowing[i],
                            dtAvatares.getResourceId(i, -1)
            )
            listUser.add(userL)
        }
        return listUser
    }

    private fun showRecyclerList(){
        rvUsers.layoutManager = LinearLayoutManager(this)
        val userListAdapter = UserListAdapter(list)
        rvUsers.adapter = userListAdapter
    }

}