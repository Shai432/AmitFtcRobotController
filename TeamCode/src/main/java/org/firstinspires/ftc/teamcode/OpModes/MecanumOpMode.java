package org.firstinspires.ftc.teamcode.OpModes;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.BotActions.IBotAction;
import org.firstinspires.ftc.teamcode.BotActions.MecanumDrive;
import org.firstinspires.ftc.teamcode.Bots.FourMotorBot;
import org.firstinspires.ftc.teamcode.Bots.Robot;
import org.firstinspires.ftc.teamcode.internals.OpModeBase;
import org.firstinspires.ftc.teamcode.internals.TelemetryHandler;

@TeleOp(name="MecanumOpMode", group="BasicOpModes")
public class MecanumOpMode extends OpModeBase {

    // Declare OpMode members.
    private ElapsedTime runtime = new ElapsedTime();

    private FourMotorBot robot;

    private IBotAction botAction;

    // ------------------------------ //
    // ---------- INIT -------------- //
    // Called once when pressing INIT //

    @Override
    public void run() {
        TelemetryHandler.logData("Status", "Run Time: " + runtime.toString());
        this.robot.DriveRobot();
        TelemetryHandler.update();
    }

    @Override
    public void customInit() {
        this.botAction = new MecanumDrive(this.gamepad1);
        this.robot = new Robot(this.botAction);
    }
}
