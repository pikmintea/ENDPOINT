package org.pikmintea.endpoint
import imgui.ImGui
import imgui.app.Application
import imgui.app.Configuration
import org.pikmintea.endpoint.data.GameData
import org.pikmintea.endpoint.gui.GameGUI
import java.math.BigInteger


class Endpoint : Application() {



    override fun configure(config: Configuration) {
        config.title = "ENDPOINT"
        config.width = 1920
        config.height = 1080

    }
    fun RunOnce()
    {
        _data = GameData()

    }

    override fun process() {

        GameGUI().render(data = _data)
    }



    }

fun main() {
    Application.launch(Endpoint())
    RunOnce();
}

