package org.firstinspires.ftc.teamcode.OpModes;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.BotActions.AutoDriveByTime;
import org.firstinspires.ftc.teamcode.BotActions.IBotAction;
import org.firstinspires.ftc.teamcode.Bots.FourMotorBot;
import org.firstinspires.ftc.teamcode.Bots.Robot;
import org.firstinspires.ftc.teamcode.internals.OpModeBase;
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
    public void run() {

        // Show the elapsed game time and wheel power.
        TelemetryHandler.logData("Status", "Run Time: " + runtime.toString());
        this.botAction.Run();
        TelemetryHandler.logData("Time", "Drive Time = (%.2f)" ,runtime.time());
        TelemetryHandler.update();

    }

    @Override
    public void customInit() {
        this.botAction = new AutoDriveByTime();
        this.robot = new Robot(this.botAction);
    }
}
