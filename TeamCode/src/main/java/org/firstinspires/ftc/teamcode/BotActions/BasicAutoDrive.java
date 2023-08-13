package org.firstinspires.ftc.teamcode.BotActions;

import org.firstinspires.ftc.teamcode.Bots.BotBase;
import org.firstinspires.ftc.teamcode.internals.Time;

public class BasicAutoDrive implements IAutonomusAction{

    protected BotBase robot;

    public BasicAutoDrive(BotBase robot)
    {
        this.robot = robot;
    }

    @Override
    public void DriveRobot() {

        // to explain the usage -> telemetry handling should be moved under telemetry handler.
        this.robot.SetTelemetry("Drive", "Auto Drive Started");
        this.robot.SetTelemetry("Motor", "left (%.2f)", 1.0 );
        this.robot.SetTelemetry("Motor", "right (%.2f)", 1.0 );
        this.robot.SetTelemetry("Drive", "drive forward");

        // Go Fw
        this.robot.setPowerOnMotors(1.0, 1.0);
        this.robot.TelemetryApply();
        Time.sleep(1000);
        // Turn left
        this.robot.SetTelemetry("Drive", "turn left");
        this.robot.SetTelemetry("Motor", "left (%.2f)", -0.5);
        this.robot.SetTelemetry("Motor", "right (%.2f)", 0.5 );
        this.robot.setPowerOnMotors(-0.5, 0.5);
        this.robot.TelemetryApply();
        Time.sleep(500);
        // Go Fw
        this.robot.SetTelemetry("Motor", "left (%.2f)", 1.0 );
        this.robot.SetTelemetry("Motor", "right (%.2f)", 1.0 );
        this.robot.SetTelemetry("Drive", "drive forward");
        this.robot.setPowerOnMotors(1.0, 1.0);
        this.robot.TelemetryApply();
        Time.sleep(1000);
        // Turn right
        this.robot.SetTelemetry("Drive", "turn right");
        this.robot.SetTelemetry("Motor", "left (%.2f)", -0.5);
        this.robot.SetTelemetry("Motor", "right (%.2f)", 0.5 );
        this.robot.setPowerOnMotors(0.5, -0.5);
        this.robot.TelemetryApply();
        Time.sleep(500);
        // Go Fw
        this.robot.SetTelemetry("Motor", "left (%.2f)", 1.0 );
        this.robot.SetTelemetry("Motor", "right (%.2f)", 1.0 );
        this.robot.SetTelemetry("Drive", "drive forward");
        this.robot.setPowerOnMotors(1.0, 1.0);
        this.robot.TelemetryApply();
        Time.sleep(500);
        // stop
        this.robot.SetTelemetry("Drive" , "Robot Parked.");
        this.robot.TelemetryApply();
        this.robot.setPowerOnMotors(0, 0);

    }
}
