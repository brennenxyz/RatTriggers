package com.chattriggers.ctjs.rattriggers

import com.chattriggers.ctjs.minecraft.objects.keybind.KeyBind
import com.chattriggers.ctjs.minecraft.wrappers.Client
import com.chattriggers.ctjs.minecraft.wrappers.Player

object player {
    private val player = Client.getMinecraft().thePlayer

    object keys {
        fun forwardKey(): KeyBind {
            return Client.getMinecraft().gameSettings.keyBindForward
        }

        fun backwardKey(): KeyBind {
            return Client.getMinecraft().gameSettings.keyBindBack
        }

        fun leftKey(): KeyBind {
            return Client.getMinecraft().gameSettings.keyBindLeft
        }

        fun rightKey(): KeyBind {
            return Client.getMinecraft().gameSettings.keyBindRight
        }

        fun sneakKey(): KeyBind {
            return Client.getMinecraft().gameSettings.keyBindSneak
        }

        fun jumpKey(): KeyBind {
            return Client.getMinecraft().gameSettings.keyBindJump
        }

        fun sprintKey(): KeyBind {
            return Client.getMinecraft().gameSettings.keyBindSprint
        }

        fun attackKey(): KeyBind {
            return Client.getMinecraft().gameSettings.keyBindAttack
        }

        fun useKey(): KeyBind {
            return Client.getMinecraft().gameSettings.keyBindUseItem
        }
    }
}
