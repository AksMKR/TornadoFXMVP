package com.tornadofx.views

import com.tornadofx.controllers.LoginController
import com.tornadofx.models.User
import javafx.scene.control.Button
import javafx.scene.control.TextField
import javafx.scene.layout.Pane
import org.controlsfx.control.Notifications
import tornadofx.*

class LoginView : View() {
    override val root: Pane by fxml("/views/LoginView.fxml")
    val userText: TextField by fxid()
    val passwordText: TextField by fxid()
    val loginButton: Button by fxid()

    val loginController: LoginController by inject()

    init {
        loginButton.setOnAction {
            val user = User(userText.text, passwordText.text)
            if (loginController.isValidUser(user)) {
                Notifications.create().text("Login Successful").showInformation()
            } else {
                Notifications.create().text("Username and/or password incorrect").showError()
            }
        }
    }
}
