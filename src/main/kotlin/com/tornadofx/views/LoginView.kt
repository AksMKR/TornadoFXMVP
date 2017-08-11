package com.tornadofx.views

import javafx.scene.control.Button
import javafx.scene.control.TextField
import javafx.scene.layout.Pane
import tornadofx.View

class LoginView : View() {
    override val root: Pane by fxml("/views/LoginView.fxml")
    val userText: TextField by fxid()
    val passwordText: TextField by fxid()
    val loginButton: Button by fxid()
}