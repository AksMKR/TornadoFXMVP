package com.tornadofx.controllers

import com.tornadofx.views.LoginView
import org.controlsfx.control.Notifications
import tornadofx.Controller

class LoginController : Controller() {

    val loginView: LoginView by inject()

    init {
        loginView.loginButton.setOnAction {
            val username = loginView.userText
            val password = loginView.passwordText

            if (username.equals("admin") and password.equals("1234")) {
                Notifications.create().text("Login Successful").showInformation()
            } else {
                Notifications.create().text("Username and/or password incorrect").showError()
            }
        }
    }
}