package org.firstinspires.ftc.teamcode.ComponentCommands;

import org.firstinspires.ftc.teamcode.Components.IRobotComponent;

public interface IComponentCommand {
    public IComponentCommand InitializeComponents(IRobotComponent component);

    public void Run();
}
