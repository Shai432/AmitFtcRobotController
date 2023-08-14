package org.firstinspires.ftc.teamcode.Bots;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.BotActions.IBotAction;

public abstract class BotBase{
    protected IBotAction botAction;

    public abstract void DriveRobot();
}
