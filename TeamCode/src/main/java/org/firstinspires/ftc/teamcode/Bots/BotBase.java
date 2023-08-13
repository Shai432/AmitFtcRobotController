package org.firstinspires.ftc.teamcode.Bots;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.BotActions.IBotAction;

public abstract class BotBase {
    protected Telemetry telemetry;
    protected HardwareMap hardwareMap;
    protected IBotAction botAction;

    public abstract void setPowerOnMotors(double leftPower, double rightPower);

    public abstract void SetTelemetry(String caption, String format, Object... args);
    public abstract void SetTelemetry(String caption, Object... args);
    public abstract void TelemetryApply();
}
