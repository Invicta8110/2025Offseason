package org.firstinspires.ftc.teamcode.opmodes;

import com.acmerobotics.roadrunner.actions.SequentialAction;
import com.acmerobotics.roadrunner.ftc.Actions;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import org.firstinspires.ftc.teamcode.mechanisms.LinearSlides;
import org.firstinspires.ftc.teamcode.mechanisms.SidhClaw;

public class ActionsTest extends LinearOpMode {
    SidhClaw claw;
    LinearSlides slides;

    @Override
    public void runOpMode() {
        claw = new SidhClaw(hardwareMap);
        slides = new LinearSlides(hardwareMap);

        waitForStart();

        Actions.runBlocking(
                new SequentialAction(
                        claw.open(),
                        slides.goToTargetLavi(LinearSlides.HIGH_POS),
                        claw.close()
                )
        );
    }
}
