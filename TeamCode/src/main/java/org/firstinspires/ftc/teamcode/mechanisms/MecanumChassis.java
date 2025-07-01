package org.firstinspires.ftc.teamcode.mechanisms;

import com.acmerobotics.roadrunner.actions.Action;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import kotlin.NotImplementedError;

public class MecanumChassis {
    DcMotorEx leftFront, leftBack, rightFront, rightBack;

    public MecanumChassis(/* figure out this */) {

    }

    public Action setDriveVectors(double x, double y, double rot) {
        throw new NotImplementedError("do this");
    }
}
