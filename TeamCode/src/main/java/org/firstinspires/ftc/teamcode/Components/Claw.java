package org.firstinspires.ftc.teamcode.Components;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.configuration.annotations.MotorType;

import org.firstinspires.ftc.teamcode.internals.Globals;
import org.firstinspires.ftc.teamcode.internals.HardwareHandler;

public class Claw implements IRobotComponent {
    protected CRServo claw = null;

    public Claw()
    {
        this.Init();
    }
    @Override
    public void Init() {
        this.claw = HardwareHandler.GetHardwareItem(CRServo.class, Globals.Claw);
    }
}
