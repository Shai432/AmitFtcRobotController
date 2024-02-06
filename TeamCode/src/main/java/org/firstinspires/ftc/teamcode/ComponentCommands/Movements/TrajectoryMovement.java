package org.firstinspires.ftc.teamcode.ComponentCommands.Movements;


import androidx.annotation.NonNull;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class TrajectoryMovement implements IMovement{
    private Queue<IMovement> movementsSequence = new LinkedList<>();

    public IMovement AddMove(IMovement movement)
    {
        this.movementsSequence.add(movement);
        return this;
    }
}
