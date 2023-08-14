package org.firstinspires.ftc.teamcode.BotActions;

import org.firstinspires.ftc.teamcode.Bots.IRobComponent;
import org.firstinspires.ftc.teamcode.Bots.RobotMotors;

public interface IBotAction {
    public void InitializeComponents(IRobComponent component);

    public void Run();
}
