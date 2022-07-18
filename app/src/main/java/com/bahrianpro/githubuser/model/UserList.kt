package com.bahrianpro.githubuser.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class UserList(
    var username: String,
    var name: String,
    var location: String,
    var repository: String,
    var company: String,
    var followers: String,
    var following: String,
    var avatares: Int
) : Parcelable
