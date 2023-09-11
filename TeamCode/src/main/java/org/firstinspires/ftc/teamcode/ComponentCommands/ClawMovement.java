package org.firstinspires.ftc.teamcode.ComponentCommands;

import com.qualcomm.robotcore.hardware.Gamepad;

import org.firstinspires.ftc.teamcode.Components.Claw;
import org.firstinspires.ftc.teamcode.Components.IRobotComponent;

public class ClawMovement implements ITeleopAction {
    private Claw claw;

    private Gamepad gamepad;

    public ClawMovement(IRobotComponent component)
    {
        this.InitializeComponents(component);
    }

    @Override
    public IComponentCommand InitializeComponents(IRobotComponent component) {
        this.claw = (Claw) component;
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
