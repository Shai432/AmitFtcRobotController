package org.firstinspires.ftc.teamcode.BotActions;

import com.qualcomm.robotcore.hardware.Gamepad;

import org.firstinspires.ftc.teamcode.Bots.IRobComponent;
import org.firstinspires.ftc.teamcode.Bots.RobotMotors;

public class MecanumDrive implements ITeleopAction{
    protected Gamepad gamepad;

    protected RobotMotors motors;


    public MecanumDrive(Gamepad gamepad)
    {
        this.gamepad = gamepad;
    }

    @Override
    public void InitializeComponents(IRobComponent component) {
        this.motors = (RobotMotors) component;

    }

    @Override
    public void Run() {
        double y = -this.gamepad.left_stick_y; // Remember, this is reversed!
        double x = this.gamepad.left_stick_x * 1.1; // Counteract imperfect strafing
        double rx = this.gamepad.right_stick_x;

        // Denominator is the largest motor power (absolute value) or 1
        // This ensures all the powers maintain the same ratio, but only when
        // at least one is out of the range [-1, 1]
        double denominator = Math.max(Math.abs(y) + Math.abs(x) + Math.abs(rx), 1);
        double frontLeftPower = (y + x + rx) / denominator;
        double backLeftPower = (y - x + rx) / denominator;
        double frontRightPower = (y - x - rx) / denominator;
        double backRightPower = (y + x - rx) / denominator;

        this.motors.setPowerOnAllMotors(frontRightPower,frontLeftPower,backRightPower,backLeftPower);

    }
}
