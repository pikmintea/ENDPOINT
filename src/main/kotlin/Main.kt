package org.pikmintea.endpoint
import imgui.ImGui
import imgui.app.Application
import imgui.app.Configuration
import org.pikmintea.endpoint.data.GameData
import org.pikmintea.endpoint.gui.GameGUI
import java.math.BigInteger


class Endpoint : Application() {
private val _gamedata = GameData()
private val _gamegui = GameGUI()


    override fun configure(config: Configuration) {
        config.title = "ENDPOINT"
        config.width = 1920
        config.height = 1080

    }

    override fun process() {

_gamegui.render(_data = _gamedata);

    }



    }

fun main() {
    Application.launch(Endpoint())

}

