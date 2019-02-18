package frc.team7195.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team7195.Robot;

import static frc.team7195.subsystems.Arm.beltsOff;


public class BeltsForward extends Command {
    public BeltsForward() {
        requires(Robot.arm);
    }

    @Override
    protected void initialize() {

    }

    @Override
    protected void execute() {

    }

    @Override
    protected boolean isFinished() {
        // TODO: Make this return true when this Command no longer needs to run execute()
        return false;
    }

    @Override
    protected void end() {

    }

    @Override
    protected void interrupted() {
        beltsOff();
        super.interrupted();
    }
}
