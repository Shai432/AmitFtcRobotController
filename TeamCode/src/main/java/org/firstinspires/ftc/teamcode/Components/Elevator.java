package org.firstinspires.ftc.teamcode.Components;

import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.internals.Globals;
import org.firstinspires.ftc.teamcode.internals.HardwareHandler;

public class Elevator implements IRobotComponent {

    private DcMotor elevator = null;

    public  Elevator()
    {
        this.Init();
    }

    @Override
    public void Init() {
        this.elevator = HardwareHandler.GetHardwareItem(DcMotor.class, Globals.Elevator);
    }
}
