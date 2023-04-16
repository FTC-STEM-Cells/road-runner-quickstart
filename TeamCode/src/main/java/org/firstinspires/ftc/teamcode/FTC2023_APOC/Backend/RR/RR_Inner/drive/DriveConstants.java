package org.firstinspires.ftc.teamcode.FTC2023_APOC.Backend.RR.RR_Inner.drive;

import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;
import com.qualcomm.robotcore.hardware.PIDFCoefficients;

@Config
public class DriveConstants {
    public static final double TICKS_PER_REV = 537.6;
    public static final double MAX_RPM = 312.5;

    public static final boolean RUN_USING_ENCODER = true;
    public static PIDFCoefficients MOTOR_VELO_PID = new PIDFCoefficients(25, 0, 15, 13.1914199324575);

    public static double WHEEL_RADIUS = 2; // in
    public static double GEAR_RATIO = 1.01; // output (wheel) speed / input (motor) speed
    public static double TRACK_WIDTH = 13.94; // in

    public static double kV = 1.0 / rpmToVelocity(MAX_RPM);
    public static double kA = 0;
    public static double kStatic = 0;

    public static double MAX_VEL = 50.40063196220956;
    public static double MAX_ACCEL = 30;
    public static double MAX_ANG_VEL = 12.750001550084178;
    public static double MAX_ANG_ACCEL = Math.toRadians(60);

    public static RevHubOrientationOnRobot.LogoFacingDirection LOGO_FACING_DIR =
            RevHubOrientationOnRobot.LogoFacingDirection.RIGHT;
    public static RevHubOrientationOnRobot.UsbFacingDirection USB_FACING_DIR =
            RevHubOrientationOnRobot.UsbFacingDirection.UP;


    public static double encoderTicksToInches(double ticks) {
        return WHEEL_RADIUS * 2 * Math.PI * GEAR_RATIO * ticks / TICKS_PER_REV;
    }

    public static double rpmToVelocity(double rpm) {
        return rpm * GEAR_RATIO * 2 * Math.PI * WHEEL_RADIUS / 60.0;
    }

    public static double getMotorVelocityF(double ticksPerSecond) {
        // see https://docs.google.com/document/d/1tyWrXDfMidwYyP_5H4mZyVgaEswhOC35gvdmP-V-5hA/edit#heading=h.61g9ixenznbx
        return 32767 / ticksPerSecond;
    }
}
