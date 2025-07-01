package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;
import org.firstinspires.ftc.teamcode.control.PIDFController;
import com.acmerobotics.roadrunner.actions.Action;

public class LinearSlides {
    public static int LOW_POS = 0;
    public static int HIGH_POS = 1000;
    public PIDFController controller;

    private final Motor leftMotor;
    private final Motor rightMotor;

    public LinearSlides(Motor leftMotor, Motor rightMotor) {
        this.leftMotor = leftMotor.reversed();
        this.rightMotor = rightMotor;
        this.controller = new PIDFController(0.01, 0.0, 0.001);
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

    public int getTarget() {
        return leftMotor.getTarget();
    }

    public double getPosition() {
        return leftMotor.getPosition();
    }

    public Action goToTargetSidh(double x){
        return p-> {
            controller.targetPosition = (x);
            setPower(controller.update(getPosition()));
            return Math.abs(x-getPosition())>10;
        };
    }

    public Action goToTargetLavi(int y){
        return p-> {
            controller.targetPosition = (y);
            setPower(controller.update(getPosition()));
            return Math.abs(y - getPosition()) < 10;
        };
    }
}

