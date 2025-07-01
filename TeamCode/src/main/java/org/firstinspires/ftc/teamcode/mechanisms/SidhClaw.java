package org.firstinspires.ftc.teamcode.mechanisms;

import com.acmerobotics.roadrunner.actions.Action;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class SidhClaw {
    private Servo servo;
    public SidhClaw(HardwareMap hwMap) {
        servo = hwMap.get(Servo.class, "claw_servo");
    }

    public Action open() {

        return p-> {
            servo.setPosition(1);
            return false;
        };
    }
    public Action close() {
        return p-> {
            servo.setPosition(0);
            return false;
        };
    }


}
