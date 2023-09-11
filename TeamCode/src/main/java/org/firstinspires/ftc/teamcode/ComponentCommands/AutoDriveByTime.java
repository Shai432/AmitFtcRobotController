package org.firstinspires.ftc.teamcode.ComponentCommands;

import org.firstinspires.ftc.teamcode.Components.IRobotComponent;
import org.firstinspires.ftc.teamcode.Components.RobotMotors;
import org.firstinspires.ftc.teamcode.internals.TelemetryHandler;
import org.firstinspires.ftc.teamcode.internals.Time;

public class AutoDriveByTime implements IAutonomusAction
{
    protected RobotMotors motors;
    public AutoDriveByTime()
    {
    }

    @Override
    public IComponentCommand InitializeComponents(IRobotComponent component) {
        this.motors = (RobotMotors) component;
        return this;

    }

    @Override
    public void Run() {

        // to explain the usage -> telemetry handling should be moved under telemetry handler.
        TelemetryHandler.logData("Drive", "Auto Drive Started");
        TelemetryHandler.logData("Motor", "left (%.2f)", 1.0 );
        TelemetryHandler.logData("Motor", "right (%.2f)", 1.0 );
        TelemetryHandler.logData("Drive", "drive forward");

        // Go Fw
        this.motors.setPowerOnRLMotors(1.0, 1.0);
        TelemetryHandler.update();
        Time.sleep(1000);
        // Turn left
        TelemetryHandler.logData("Drive", "turn left");
        TelemetryHandler.logData("Motor", "left (%.2f)", -0.5);
        TelemetryHandler.logData("Motor", "right (%.2f)", 0.5 );
        this.motors.setPowerOnRLMotors(-0.5, 0.5);
        TelemetryHandler.update();
        Time.sleep(500);
        // Go Fw
        TelemetryHandler.logData("Motor", "left (%.2f)", 1.0 );
        TelemetryHandler.logData("Motor", "right (%.2f)", 1.0 );
        TelemetryHandler.logData("Drive", "drive forward");
        this.motors.setPowerOnRLMotors(1.0, 1.0);
        TelemetryHandler.update();
        Time.sleep(1000);
        // Turn right
        TelemetryHandler.logData("Drive", "turn right");
        TelemetryHandler.logData("Motor", "left (%.2f)", -0.5);
        TelemetryHandler.logData("Motor", "right (%.2f)", 0.5 );
        this.motors.setPowerOnRLMotors(0.5, -0.5);
        TelemetryHandler.update();
        Time.sleep(500);
        // Go Fw
        TelemetryHandler.logData("Motor", "left (%.2f)", 1.0 );
        TelemetryHandler.logData("Motor", "right (%.2f)", 1.0 );
        TelemetryHandler.logData("Drive", "drive forward");
        this.motors.setPowerOnRLMotors(1.0, 1.0);
        TelemetryHandler.update();
        Time.sleep(500);
        // stop
        TelemetryHandler.logData("Drive" , "Robot Parked.");
        TelemetryHandler.update();
        this.motors.setPowerOnRLMotors(0, 0);
    }
}
