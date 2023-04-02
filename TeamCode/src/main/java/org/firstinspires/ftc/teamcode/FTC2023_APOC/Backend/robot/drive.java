package org.firstinspires.ftc.teamcode.FTC2023_APOC.Backend.robot;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.Servo;

public class drive {
    public static void tankDrive(DcMotor frontLeft, DcMotor frontRight,
                                 DcMotor backLeft, DcMotor backRight,
                                 DcMotor one, DcMotor two, Servo intake,
                                 double motorSpeed, Gamepad gamepad1, Gamepad gamepad2) {
        frontLeft.setPower(motorSpeed * (-gamepad1.left_stick_y + gamepad1.right_stick_x + gamepad1.left_stick_x));
        frontRight.setPower(motorSpeed * (gamepad1.left_stick_y + gamepad1.right_stick_x + gamepad1.left_stick_x));
        backLeft.setPower(motorSpeed * (gamepad1.left_stick_y - gamepad1.right_stick_x + gamepad1.left_stick_x));
        backRight.setPower(motorSpeed * (-gamepad1.left_stick_y - gamepad1.right_stick_x + gamepad1.left_stick_x));
        one.setPower(motorSpeed * gamepad2.left_stick_y); two.setPower(motorSpeed * gamepad2.left_stick_y);
    }
    //TODO: ADD DRIVER ORIENTED DRIVE HERE
}
