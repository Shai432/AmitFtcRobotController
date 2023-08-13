package org.firstinspires.ftc.teamcode.Bots;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.BotActions.IBotAction;

public abstract class FourMotorBot extends BotBase{

    // Motors Declaration:
    protected DcMotor leftFrontDrive = null;
    protected DcMotor rightFrontDrive = null;
    protected DcMotor leftBackDrive = null;
    protected DcMotor rightBackDrive = null;

    //----------------------


    // Empty constructor:

    public FourMotorBot(){}

    public FourMotorBot(HardwareMap hwMap,Telemetry telemetry, IBotAction botAction)
    {
        this.telemetry = telemetry;
        this.hardwareMap = hwMap;
        this.botAction = botAction;
        this.InitializeBot();
    }

    public void SetTelemetry(String caption, String format, Object... args)
    {
        this.telemetry.addData(caption, format, args);
    }

    public void SetTelemetry(String caption, Object... args)
    {
        this.telemetry.addData(caption, args);
    }

    public void TelemetryApply()
    {
        this.telemetry.update();
    }

    public void setPowerOnMotors(double rightPower, double leftPower)
    {
        leftBackDrive.setPower(leftPower);
        leftFrontDrive.setPower(leftPower);
        rightBackDrive.setPower(rightPower);
        rightFrontDrive.setPower(rightPower);
    }

    private void InitializeBot()
    {
        InitializeMotors(this.hardwareMap);
        setDirections();
    }

    // Initialize Motors from hw data.
    private void InitializeMotors(HardwareMap hwMap)
    {
        leftBackDrive = hwMap.get(DcMotor.class, Globals.BACK_MOTOR_L);
        leftFrontDrive = hwMap.get(DcMotor.class, Globals.FRONT_MOTOR_L);
        rightBackDrive = hwMap.get(DcMotor.class, Globals.BACK_MOTOR_R);
        rightFrontDrive = hwMap.get(DcMotor.class, Globals.BACK_MOTOR_R);
    }

    // Set direction for each motor.
    private void setDirections()
    {
        leftBackDrive.setDirection(DcMotor.Direction.REVERSE);
        leftFrontDrive.setDirection(DcMotor.Direction.REVERSE);
        rightBackDrive.setDirection(DcMotor.Direction.FORWARD);
        rightFrontDrive.setDirection(DcMotor.Direction.FORWARD);
    }
}
