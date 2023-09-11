package org.firstinspires.ftc.teamcode.Components;

import com.qualcomm.hardware.bosch.BHI260IMU;

import org.firstinspires.ftc.teamcode.internals.HardwareHandler;

public class IMU implements IRobotComponent{

    private BHI260IMU IMU = null;

    @Override
    public void Init() {
        HardwareHandler.GetHardwareItem(BHI260IMU.class, "IMU");
    }
}
