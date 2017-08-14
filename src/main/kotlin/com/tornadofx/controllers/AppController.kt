package com.tornadofx.controllers

import com.tornadofx.views.AppView
import com.tornadofx.views.LoginView
import tornadofx.Controller
import tornadofx.add

class AppController : Controller() {

    val appView: AppView by inject()
    val loginView: LoginView by inject()

    fun init() {
        appView.add(loginView.root)
    }
}
