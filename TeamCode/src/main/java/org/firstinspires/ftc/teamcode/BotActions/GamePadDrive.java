package org.firstinspires.ftc.teamcode.BotActions;

import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.util.Range;

import org.firstinspires.ftc.teamcode.Bots.BotBase;
import org.firstinspires.ftc.teamcode.Bots.TeleopBot;

public class GamePadDrive implements ITeleopAction{
    protected BotBase robot;
    protected Gamepad gamepad;

    public GamePadDrive(BotBase robot, Gamepad gamepad)
    {
        this.robot = robot;
        this.gamepad =gamepad;
    }


    @Override
    public void DriveRobot() {
        double leftPower;
        double rightPower;

        double drive = -gamepad.left_stick_y;
        double turn  =  gamepad.right_stick_x;

        leftPower    = Range.clip(drive + turn, -1.0, 1.0) ;
        rightPower   = Range.clip(drive - turn, -1.0, 1.0) ;

        this.robot.setPowerOnMotors(rightPower, leftPower);

        this.robot.SetTelemetry("Motors", "left (%.2f)", leftPower);
        this.robot.SetTelemetry("Motors", "right (%.2f)", rightPower);
    }
}
