package org.firstinspires.ftc.teamcode.MotionRunner;

import org.firstinspires.ftc.teamcode.ComponentCommands.IComponentCommand;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class MotionRunner implements IMotionRunner {
    protected final Queue<IComponentCommand> Motions = new LinkedList<>();

    @Override
    public IMotionRunner Add(IComponentCommand command)
    {
        this.Motions.add(command);
        return this;
    }

    @Override
    public void Run()
    {
        Iterator<IComponentCommand> itr = this.Motions.iterator();
        while (itr.hasNext())
        {
            this.Motions.poll().Run();
        }
    }
}
