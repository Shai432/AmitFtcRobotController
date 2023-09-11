package org.firstinspires.ftc.teamcode.ComponentCommands;

import org.firstinspires.ftc.teamcode.ComponentCommands.Movements.IMovement;
import org.firstinspires.ftc.teamcode.Components.IRobotComponent;
import org.firstinspires.ftc.teamcode.Components.RobotMotors;

import java.util.LinkedList;
import java.util.Queue;

public class AutoMecanumDrive implements IAutonomusAction{
    protected RobotMotors motors;

    protected final Queue<IMovement> moves = new LinkedList<>();

    public AutoMecanumDrive(IRobotComponent component)
    {
        this.InitializeComponents(component);
    }

    @Override
    public IComponentCommand InitializeComponents(IRobotComponent component) {
        this.motors = (RobotMotors) component;
        return this;
    }

    @Override
    public void Run() {
    }
}
