package com.chattriggers.ctjs.rattriggers

import net.minecraft.client.settings.KeyBinding
import com.chattriggers.ctjs.minecraft.wrappers.Client
import com.chattriggers.ctjs.minecraft.wrappers.Player

object player {
    private val player = Client.getMinecraft().thePlayer

    object keys {
        fun forwardKey(): KeyBinding {
            return Client.getMinecraft().gameSettings.keyBindForward
        }

        fun backwardKey(): KeyBinding {
            return Client.getMinecraft().gameSettings.keyBindBack
        }

        fun leftKey(): KeyBinding {
            return Client.getMinecraft().gameSettings.keyBindLeft
        }

        fun rightKey(): KeyBinding {
            return Client.getMinecraft().gameSettings.keyBindRight
        }

        fun sneakKey(): KeyBinding {
            return Client.getMinecraft().gameSettings.keyBindSneak
        }

        fun jumpKey(): KeyBinding {
            return Client.getMinecraft().gameSettings.keyBindJump
        }

        fun sprintKey(): KeyBinding {
            return Client.getMinecraft().gameSettings.keyBindSprint
        }

        fun attackKey(): KeyBinding {
            return Client.getMinecraft().gameSettings.keyBindAttack
        }

        fun useKey(): KeyBinding {
            return Client.getMinecraft().gameSettings.keyBindUseItem
        }
    }
}
