package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.subsystems.Arm;

import static frc.robot.subsystems.Arm.beltsReverse;


public class BeltsReverse extends Command {
    public BeltsReverse() {
        //requires(arm);
    }

    @Override
    protected void initialize() {

    }

    @Override
    protected void execute() {
        Arm.beltsReverse();
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void end() {
        Arm.beltsOff();
    }

    @Override
    protected void interrupted() {
        Arm.beltsOff();
        super.interrupted();
    }
}
