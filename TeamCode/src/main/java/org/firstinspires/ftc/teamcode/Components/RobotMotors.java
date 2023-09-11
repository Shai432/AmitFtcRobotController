package org.firstinspires.ftc.teamcode.Components;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;

import org.firstinspires.ftc.teamcode.internals.Globals;
import org.firstinspires.ftc.teamcode.internals.HardwareHandler;

public class RobotMotors implements IRobotComponent {
    // Motors Declaration:
    protected DcMotorEx leftFrontMotor = null;
    protected DcMotorEx rightFrontMotor = null;
    protected DcMotorEx leftBackMotor = null;
    protected DcMotorEx rightBackMotor = null;

    public RobotMotors()
    {
        this.Init();
    }

    @Override
    public void Init()
    {
        leftBackMotor = HardwareHandler.GetHardwareItem(DcMotorEx.class, Globals.BACK_MOTOR_L);
        leftFrontMotor = HardwareHandler.GetHardwareItem(DcMotorEx.class, Globals.FRONT_MOTOR_L);
        rightBackMotor = HardwareHandler.GetHardwareItem(DcMotorEx.class, Globals.BACK_MOTOR_R);
        rightFrontMotor = HardwareHandler.GetHardwareItem(DcMotorEx.class, Globals.FRONT_MOTOR_R);
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
