package com.tornadofx

import com.tornadofx.controllers.AppController
import com.tornadofx.views.AppView
import javafx.application.Application
import javafx.stage.Stage
import tornadofx.*

class DemoApp : App(AppView::class) {

    val appController: AppController by inject()

    override fun start(stage: Stage) {
        super.start(stage)
        appController.init()
    }
}

fun main(args: Array<String>) {
    Application.launch(DemoApp::class.java, *args)
}
