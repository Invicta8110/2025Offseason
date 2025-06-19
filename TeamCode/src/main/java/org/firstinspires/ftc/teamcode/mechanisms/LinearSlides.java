package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class LinearSlides {
    public static int LOW_POS = 0;
    public static int HIGH_POS = 1000;

    private final Motor leftMotor;
    private final Motor rightMotor;

    public LinearSlides(Motor leftMotor, Motor rightMotor) {
        this.leftMotor = leftMotor.reversed();
        this.rightMotor = rightMotor;
    }

    public LinearSlides(HardwareMap hardwareMap) {
        this(
                new Motor(hardwareMap.get(DcMotorEx.class, "slidesLeft")),
                new Motor(hardwareMap.get(DcMotorEx.class, "slidesRight"))
        );
    }

    public void setPower(double power) {
        leftMotor.setPower(power);
        rightMotor.setPower(power);
    }

    public void setTarget(int position) {
        leftMotor.setTarget(position);
        rightMotor.setTarget(position);
    }

    public double getPosition() {
        return leftMotor.getPosition();
    }



}

