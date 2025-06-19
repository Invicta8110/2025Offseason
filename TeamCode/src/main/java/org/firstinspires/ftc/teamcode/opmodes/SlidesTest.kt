package org.firstinspires.ftc.teamcode.opmodes

import com.qualcomm.robotcore.eventloop.opmode.OpMode
import com.qualcomm.robotcore.eventloop.opmode.TeleOp
import org.firstinspires.ftc.teamcode.mechanisms.LinearSlides

@TeleOp(name = "SlidesTest")
class SlidesTest : OpMode() {
    lateinit var slides: LinearSlides

    override fun init() {
        slides = LinearSlides(hardwareMap)
    }

    override fun loop() {
        if (gamepad1.a) {
           slides.setTarget(LinearSlides.HIGH_POS);

        } else if (gamepad1.b) {
            slides.setTarget(LinearSlides.LOW_POS);
        }
    }
}