package com.chattriggers.ctjs.rattriggers

import com.chattriggers.ctjs.minecraft.wrappers.Client
import com.chattriggers.ctjs.minecraft.wrappers.Player
import java.util.concurrent.Executors
import java.util.concurrent.ScheduledExecutorService
import java.util.concurrent.TimeUnit

object rotations {
    private val executor: ScheduledExecutorService = Executors.newScheduledThreadPool(1)

    private fun set(yaw: Number, pitch: Number) {
        Client.getMinecraft().thePlayer.rotationYaw = yaw.toFloat()
        Client.getMinecraft().thePlayer.rotationPitch = pitch.toFloat()
    }

    /**
     * Smoothed rotations :)
     *
     * @param yaw yaw to set
     * @param pitch pitch to set
     * @param time the time it takes for rotation to finish
     */
    fun setAngles(yaw: Number, pitch: Number, time: Int) {
        val currentYaw = Player.getYaw();
        val currentPitch = Player.getPitch();

        expectedYaw = yaw;
        expectedPitch = pitch;

        val startTime = System.currentTimeMillis();


        fun updateAngles() {
            val currentTime = System.currentTimeMillis();
            val elapsedTime = currentTime - startTime;

            if (elapsedTime >= duration) {
                this.set(yaw, pitch);
                return;
            }

            val progress = elapsedTime / duration;

            val newYaw = currentYaw + (targetYaw - currentYaw) * progress;
            val newPitch = currentPitch + (targetPitch - currentPitch) * progress;

            this.set(newYaw, newPitch);

            executor.schedule({
                set(newYaw, newPitch);
            }, 1, TimeUnit.MILLISECONDS)
        }

        updateAngles();
    }

    /**
     * unfinished
     */
    object serverside {
        fun set(yaw: Number, pitch: Number) {

        }
    }
}