package org.firstinspires.ftc.teamcode.Bots;

import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.internals.HardwareHandler;

public class RobotMotors implements IRobComponent {
    // Motors Declaration:
    protected DcMotor leftFrontMotor = null;
    protected DcMotor rightFrontMotor = null;
    protected DcMotor leftBackMotor = null;
    protected DcMotor rightBackMotor = null;

    public RobotMotors()
    {
        this.InitializeMotors();
    }

    private void InitializeMotors()
    {
        leftBackMotor = HardwareHandler.GetHardwareItem(DcMotor.class, Globals.BACK_MOTOR_L);
        leftFrontMotor = HardwareHandler.GetHardwareItem(DcMotor.class, Globals.FRONT_MOTOR_L);
        rightBackMotor = HardwareHandler.GetHardwareItem(DcMotor.class, Globals.BACK_MOTOR_R);
        rightFrontMotor = HardwareHandler.GetHardwareItem(DcMotor.class, Globals.FRONT_MOTOR_R);
        this.setDirections();
    }

    // Set direction for each motor.
    private void setDirections()
    {
        leftBackMotor.setDirection(DcMotor.Direction.REVERSE);
        leftFrontMotor.setDirection(DcMotor.Direction.REVERSE);
        rightBackMotor.setDirection(DcMotor.Direction.FORWARD);
        rightFrontMotor.setDirection(DcMotor.Direction.FORWARD);
    }

    public void setPowerOnRLMotors(double rightPower, double leftPower)
    {
         this.setPowerOnLeftMotors(leftPower);
         this.setPowerOnRightMotors(rightPower);
    }

    public void setPowerOnAllMotors(double FR, double FL, double BR, double BL)
    {
        rightFrontMotor.setPower(FR);
        leftFrontMotor.setPower(FL);
        rightBackMotor.setPower(BR);
        leftBackMotor.setPower(BL);
    }

    public void setPowerOnRightMotors(double rightPower)
    {
        rightBackMotor.setPower(rightPower);
        rightFrontMotor.setPower(rightPower);
    }

    public void setPowerOnLeftMotors(double leftPower)
    {
        leftBackMotor.setPower(leftPower);
        leftFrontMotor.setPower(leftPower);
    }

    public void setPowerOnFrontMotors(double leftPower, double rightPower)
    {
        leftFrontMotor.setPower(leftPower);
        rightFrontMotor.setPower(rightPower);
    }

    public void setPowerOnBackMotors(double leftPower, double rightPower)
    {
        leftBackMotor.setPower(leftPower);
        rightFrontMotor.setPower(rightPower);
    }
}
