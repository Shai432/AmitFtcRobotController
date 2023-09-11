package org.firstinspires.ftc.teamcode.ComponentCommands;

import com.qualcomm.robotcore.hardware.Gamepad;

import org.firstinspires.ftc.teamcode.Components.Elevator;
import org.firstinspires.ftc.teamcode.Components.IRobotComponent;

public class ElevatorMovement implements ITeleopAction{

    private Elevator elevator = null;

    private Gamepad gamepad;

    public ElevatorMovement(IRobotComponent component)
    {
        this.InitializeComponents(component);
    }

    @Override
    public IComponentCommand InitializeComponents(IRobotComponent component) {
        this.elevator = (Elevator) component;
        return this;
    }

    @Override
    public void Run() {

    }

    @Override
    public ITeleopAction SetSource(Gamepad gamepad) {
        this.gamepad = gamepad;
        return this;
    }
}
