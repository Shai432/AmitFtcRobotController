package org.firstinspires.ftc.teamcode.BotActions;

import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.util.Range;

import org.firstinspires.ftc.teamcode.Bots.IRobComponent;
import org.firstinspires.ftc.teamcode.Bots.RobotMotors;

public class SimpleGamePadDrive implements ITeleopAction{
    protected Gamepad gamepad;

    protected RobotMotors motors;


    public SimpleGamePadDrive(Gamepad gamepad)
    {
        this.gamepad = gamepad;
    }

    @Override
    public void InitializeComponents(IRobComponent component) {
        this.motors = (RobotMotors) component;

    }

    @Override
    public void Run() {
        double drive = -gamepad.left_stick_y;
        double turn  =  gamepad.right_stick_x;

        double leftPower =  Range.clip(drive + turn, -1.0, 1.0) ;

        double rightPower = Range.clip(drive - turn, -1.0, 1.0) ;

        this.motors.setPowerOnAllMotors(rightPower, leftPower);

    }
}
