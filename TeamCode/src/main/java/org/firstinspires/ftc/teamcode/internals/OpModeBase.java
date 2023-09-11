package org.firstinspires.ftc.teamcode.internals;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.MotionRunner.IMotionRunner;
import org.firstinspires.ftc.teamcode.MotionRunner.MotionRunner;

public abstract class OpModeBase extends LinearOpMode {

    public ElapsedTime runtime = new ElapsedTime();

    public IMotionRunner motionRunner;

    @Override
    public void runOpMode() throws InterruptedException {

        this.internalInit();

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

            this.run();

            TelemetryHandler.update();
        }

    }

    public void internalInit()
    {
        TelemetryHandler.InitializeTelemetry(this.telemetry);
        HardwareHandler.InitializeHardwareMap(this.hardwareMap);
        this.motionRunner = new MotionRunner();
        this.customInit();
    };

    public abstract void run();

    public abstract void customInit();

}
