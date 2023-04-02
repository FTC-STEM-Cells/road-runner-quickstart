package org.firstinspires.ftc.teamcode.FTC2023_APOC.Backend.robot;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class initRobot {
    public static robot initRobot(Gamepad gamepad1, Gamepad gamepad2, HardwareMap hardwareMap, Telemetry telemetry){
        return new robot(gamepad1, gamepad2,
                hardwareMap.get(DcMotor.class, "front_left"),
                hardwareMap.get(DcMotor.class, "front_right"),
                hardwareMap.get(DcMotor.class, "back_left"),
                hardwareMap.get(DcMotor.class, "back_right"),
                hardwareMap.get(DcMotor.class, "one"),
                hardwareMap.get(DcMotor.class, "two"),
                hardwareMap.get(Servo.class, "intake"), telemetry);
    }
}