package org.firstinspires.ftc.teamcode.internals;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class TelemetryHandler {

    private static Telemetry TELEMETRY;

    public static void InitializeTelemetry(Telemetry driver) {
        TELEMETRY = driver;
    }

    public static void update() {
        TELEMETRY.update();
    }

    public static void clear() {
        TELEMETRY.clear();
    }

    public static void logData(String key, Object value) {
        TELEMETRY.addData(key, value);
    }

    public static void logData(String key, String format, Object... value) {
        TELEMETRY.addData(key, format, value);
    }

    public static void logText(String msg) {
        TELEMETRY.addLine(msg);
    }

    public static void log(String msg) {
        logText(msg);
    }

    public static void log(String key, Object value) {
        logData(key, value);
    }
}
