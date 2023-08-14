package org.firstinspires.ftc.teamcode.Bots;

import org.firstinspires.ftc.teamcode.BotActions.IBotAction;

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
