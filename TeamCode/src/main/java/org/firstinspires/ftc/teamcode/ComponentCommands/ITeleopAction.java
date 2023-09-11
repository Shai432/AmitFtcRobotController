package org.firstinspires.ftc.teamcode.ComponentCommands;

import com.qualcomm.robotcore.hardware.Gamepad;

public interface ITeleopAction extends IComponentCommand {
    ITeleopAction SetSource(Gamepad gamepad);
}

