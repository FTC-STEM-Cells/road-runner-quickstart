package org.firstinspires.ftc.teamcode.FTC2023_APOC.Backend.robot;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.Servo;

public class buttons {
    private final boolean objectDetected = false; private double motorSpeed;
    private final Gamepad gamepad1; private final Gamepad gamepad2; private final DcMotor frontLeft;
    private final DcMotor frontRight; private final DcMotor backLeft; private final DcMotor backRight;
    private final DcMotor one; private final DcMotor two; private final Servo intake;

    public buttons(Gamepad gamepad1, Gamepad gamepad2, DcMotor frontLeft, DcMotor frontRight, DcMotor backLeft, DcMotor backRight,
                   DcMotor one, DcMotor two, Servo intake) {
        this.gamepad1 = gamepad1; this.gamepad2 = gamepad2; this.frontLeft = frontLeft; this.frontRight = frontRight; this.backLeft = backLeft; this.backRight = backRight; this.one = one; this.two = two; this.intake = intake;
        frontLeft.setDirection(DcMotorSimple.Direction.REVERSE); backLeft.setDirection(DcMotorSimple.Direction.REVERSE); backRight.setDirection(DcMotorSimple.Direction.REVERSE);
    } public void precisionTankDrive() {
        if (gamepad1.left_trigger == 1) motorSpeed = 0.3; if (gamepad1.left_trigger != 1) motorSpeed = 0.8;
        drive.tankDrive(frontLeft, frontRight, backLeft, backRight, one, two, intake,
                motorSpeed, gamepad1, gamepad2);
        if(gamepad2.square) {intake.setPosition(0);}
        else if(gamepad2.circle){intake.setPosition(1);}
        else if(gamepad2.triangle){intake.setPosition(0.5);}
    }
}
