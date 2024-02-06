package org.firstinspires.ftc.teamcode.OpModes;

import com.acmerobotics.roadrunner.trajectory.Trajectory;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.ComponentCommands.AutoMecanumDrive;
import org.firstinspires.ftc.teamcode.ComponentCommands.ClawMovement;
import org.firstinspires.ftc.teamcode.ComponentCommands.ElevatorMovement;
import org.firstinspires.ftc.teamcode.ComponentCommands.MecanumDrive;
import org.firstinspires.ftc.teamcode.Components.Claw;
import org.firstinspires.ftc.teamcode.Components.Elevator;
import org.firstinspires.ftc.teamcode.Components.RobotMotors;
import org.firstinspires.ftc.teamcode.internals.OpModeBase;
import org.firstinspires.ftc.teamcode.internals.TelemetryHandler;

@Autonomous(name="AutoMecanumOpMode", group="BasicOpModes")
public class AutonomousMecanumDrive extends OpModeBase {

    // Declare OpMode members.
    private ElapsedTime runtime = new ElapsedTime();
    private Trajectory path;

    private AutoMecanumDrive autoMecanumDriver;

    // ------------------------------ //
    // ---------- INIT -------------- //
    // Called once when pressing INIT //

    public void SetAutoPath()
    {
    }

    @Override
    public void run() {
        TelemetryHandler.logData("Status", "Run Time: " + runtime.toString());
        this.motionRunner.Run();
        TelemetryHandler.update();
    }

    @Override
    public void customInit() {
        this.motionRunner.Add(new MecanumDrive(new RobotMotors()).SetSource(this.gamepad1))
                .Add(new ClawMovement(new Claw()).SetSource(this.gamepad1))
                .Add(new ElevatorMovement(new Elevator()).SetSource(this.gamepad1));
    }
}
