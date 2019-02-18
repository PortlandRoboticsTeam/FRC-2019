package frc.team7195.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team7195.Robot;
import frc.team7195.subsystems.Arm;


public class BeltsOff extends Command {
    public BeltsOff() {
        requires(Robot.arm);
    }

    @Override
    protected void initialize() {

    }

    @Override
    protected void execute() {
        Arm.beltsOff();
    }


    @Override
    protected boolean isFinished() {
        return true;
    }

    @Override
    protected void end() {
        Arm.beltsOff();
    }

    @Override
    protected void interrupted() {
        super.interrupted();
    }
}
