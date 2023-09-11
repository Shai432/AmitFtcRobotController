package org.firstinspires.ftc.teamcode.ComponentCommands;

import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.util.Range;

import org.firstinspires.ftc.teamcode.Components.IRobotComponent;
import org.firstinspires.ftc.teamcode.Components.RobotMotors;

public class SimpleGamePadDrive implements ITeleopAction{
    protected Gamepad gamepad;

    protected RobotMotors motors;

    public SimpleGamePadDrive(IRobotComponent component)
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
        double drive = -gamepad.left_stick_y;
        double turn  =  gamepad.right_stick_x;

        double leftPower =  Range.clip(drive + turn, -1.0, 1.0) ;

        double rightPower = Range.clip(drive - turn, -1.0, 1.0) ;

        this.motors.setPowerOnRLMotors(rightPower, leftPower);

    }

    @Override
    public ITeleopAction SetSource(Gamepad gamepad) {
        this.gamepad = gamepad;
        return this;
    }
}
