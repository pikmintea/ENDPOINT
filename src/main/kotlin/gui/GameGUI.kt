package org.pikmintea.endpoint.gui

import imgui.ImGui
import imgui.flag.ImGuiCond
import org.pikmintea.endpoint.data.GameData
import java.math.BigInteger


class GameGUI {

    fun render(_data : GameData)
    {
        val viewport = ImGui.getMainViewport()

        ImGui.setNextWindowPos(
            viewport.getPosX(),
            viewport.getPosY(),
            ImGuiCond.Always
        )

        if (ImGui.button("Send Packet")) {
            _data.bits += BigInteger.ONE;
        }
        ImGui.text("Bits : ${_data.bits}")
    }



}