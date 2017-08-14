package com.tornadofx.controllers

import com.tornadofx.models.User
import tornadofx.*

class LoginController : Controller() {

    val currentUser = User("admin", "1234")

    fun isValidUser(user: User) = (currentUser == user)

}
