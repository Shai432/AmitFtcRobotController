package org.firstinspires.ftc.teamcode.Bots;

import org.firstinspires.ftc.teamcode.BotActions.IBotAction;

/*
Represent a Robot.
Robot may include more sensors.
 */

public class Robot extends FourMotorBot
{
    public Robot(IBotAction teleopAction)
    {
        this.botAction = teleopAction;
        this.botAction.InitializeComponents(this.motors);
    }
    @Override
    public void DriveRobot()
    {
        this.botAction.Run();
    }
}
