@file:JvmName("Motors")
package org.firstinspires.ftc.teamcode.mechanisms

import com.qualcomm.robotcore.hardware.DcMotor
import com.qualcomm.robotcore.hardware.DcMotorEx

const val CPR_435 = 384.5

class Motor(private val internal: DcMotorEx) {
    var power: Double by internal::power
    var runmode: DcMotor.RunMode by internal::mode
    val position: Int get() = internal.currentPosition

    var target: Int
        get() = internal.targetPosition
        set(value) {
            internal.targetPosition = value
            runmode = DcMotor.RunMode.RUN_TO_POSITION
        }

    fun reversed(): Motor {
        internal.direction = internal.direction.inverted();
        return this
    }
}