package org.firstinspires.ftc.teamcode.Bots;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.BotActions.IBotAction;
import org.firstinspires.ftc.teamcode.internals.HardwareHandler;
import org.firstinspires.ftc.teamcode.internals.TelemetryHandler;

/*
that class represent a robot.
*/
public abstract class FourMotorBot extends BotBase
{
    public RobotMotors motors;

    public FourMotorBot()
    {
        this.motors = new RobotMotors();
    }
}
