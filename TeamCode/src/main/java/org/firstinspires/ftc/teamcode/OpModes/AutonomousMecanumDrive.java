package org.firstinspires.ftc.teamcode.OpModes;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.ComponentCommands.AutoMecanumDrive;
import org.firstinspires.ftc.teamcode.Components.Elevator;
import org.firstinspires.ftc.teamcode.RoadRunner.teamcode.drive.SampleMecanumDrive;
import org.firstinspires.ftc.teamcode.internals.OpModeBase;
import org.firstinspires.ftc.teamcode.internals.TelemetryHandler;

@Autonomous(name="AutoMecanumOpMode", group="BasicOpModes")
public class AutonomousMecanumDrive extends OpModeBase {

    // Declare OpMode members.
    private ElapsedTime runtime = new ElapsedTime();
    private Trajectory path;

    private SampleMecanumDrive drive;

    private Elevator elv;

    private AutoMecanumDrive autoMecanumDriver;

    // ------------------------------ //
    // ---------- INIT -------------- //
    // Called once when pressing INIT //

    private void SetAutoPath()
    {
        // for now lets use as is, deep refactor is needed.
        // mecanum preset;
       this.drive = new SampleMecanumDrive(this.hardwareMap);

        // build path:
        this.path = drive.trajectoryBuilder(new Pose2d())
                .forward(50)
                .addDisplacementMarker( () ->
                {
                    // run actions here.
                    // e.g -> elevator up / down etc
                })
                .build();
    }

    @Override
    public void run() {
        TelemetryHandler.logData("Status", "Run Time: " + runtime.toString());
        // follow the path:
        drive.followTrajectory(path);
        // this.motionRunner.Run();
        TelemetryHandler.update();
    }

    @Override
    public void customInit() {
        /*this.elv = new Elevator();
        this.motionRunner.Add(new MecanumDrive(new RobotMotors()).SetSource(this.gamepad1))
                .Add(new ClawMovement(new Claw()).SetSource(this.gamepad1))
                .Add(new ElevatorMovement(new Elevator()).SetSource(this.gamepad1));*/

        this.SetAutoPath();
    }
}
