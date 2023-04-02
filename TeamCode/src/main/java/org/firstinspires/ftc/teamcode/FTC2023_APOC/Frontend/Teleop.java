package org.firstinspires.ftc.teamcode.FTC2023_APOC.Frontend;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.FTC2023_APOC.Backend.robot.initRobot;
import org.firstinspires.ftc.teamcode.FTC2023_APOC.Backend.robot.robot;


@TeleOp(name = "Teleop")
public class Teleop extends OpMode {
    robot ROBOT;
    @Override public void init() {
        ROBOT = initRobot.initRobot(gamepad1, gamepad2, hardwareMap, telemetry);
    } @Override public void loop() {
        ROBOT.start();
        ROBOT.telemetry();
    }
}