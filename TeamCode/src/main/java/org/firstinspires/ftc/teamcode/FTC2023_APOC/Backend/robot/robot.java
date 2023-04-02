package org.firstinspires.ftc.teamcode.FTC2023_APOC.Backend.robot;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class robot { buttons buttonFunctionality; Telemetry telemetry; int i;
    public robot(Gamepad gamepad1, Gamepad gamepad2, DcMotor frontLeft,
                 DcMotor frontRight, DcMotor backLeft,
                 DcMotor backRight, DcMotor one, DcMotor two,
                 Servo intake, Telemetry telemetry) {
        this.telemetry = telemetry;
        this.buttonFunctionality = new buttons(gamepad1, gamepad2,
                frontLeft, frontRight, backLeft, backRight, one, two, intake);
        frontLeft.setDirection(DcMotorSimple.Direction.FORWARD);
        frontRight.setDirection(DcMotorSimple.Direction.FORWARD);
        backRight.setDirection(DcMotorSimple.Direction.FORWARD);
        backLeft.setDirection(DcMotorSimple.Direction.REVERSE);
        two.setDirection(DcMotorSimple.Direction.REVERSE);

    } public void start() {
        buttonFunctionality.precisionTankDrive();
    } public void telemetry() {
        telemetry.update();
    }
}