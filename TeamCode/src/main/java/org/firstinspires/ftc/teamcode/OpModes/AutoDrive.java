package org.firstinspires.ftc.teamcode.OpModes;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpModeBase;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.BotActions.AutoDriveByTime;
import org.firstinspires.ftc.teamcode.BotActions.IBotAction;
import org.firstinspires.ftc.teamcode.Bots.FourMotorBot;
import org.firstinspires.ftc.teamcode.Bots.Robot;
import org.firstinspires.ftc.teamcode.internals.TelemetryHandler;

@Autonomous(name="Robot: basic auto drive", group="Robot")
public class AutoDrive extends OpModeBase {

    // Declare OpMode members.
    private ElapsedTime runtime = new ElapsedTime();
    private FourMotorBot robot;
    private IBotAction botAction;

    // ------------------------------ //
    // ---------- INIT -------------- //
    // Called once when pressing INIT //
    @Override
    public void init() {
        super.init();
        this.botAction = new AutoDriveByTime();
        this.robot = new Robot(this.botAction);
    }

    @Override
    public void runOpMode() throws InterruptedException {
        TelemetryHandler.logData("Status", "Initialized");
        TelemetryHandler.update();

        // Wait for the game to start (driver presses PLAY)
        waitForStart();
        runtime.reset();
        // run until the end of the match (driver presses STOP)
        while (opModeIsActive()) {

            // Tank Mode uses one stick to control each wheel.
            // - This requires no math, but it is hard to drive forward slowly and keep straight.
            // leftPower  = -gamepad1.left_stick_y ;
            // rightPower = -gamepad1.right_stick_y ;

            // Show the elapsed game time and wheel power.
            TelemetryHandler.logData("Status", "Run Time: " + runtime.toString());
            this.botAction.Run();
            TelemetryHandler.logData("Time", "Drive Time = (%.2f)" ,runtime.time());
            TelemetryHandler.update();
        }
    }
}
