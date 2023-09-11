package org.firstinspires.ftc.teamcode.MotionRunner;

import org.firstinspires.ftc.teamcode.ComponentCommands.IComponentCommand;

public interface IMotionRunner {
    IMotionRunner Add(IComponentCommand command);

    void Run();
}
