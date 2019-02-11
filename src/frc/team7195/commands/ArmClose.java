package frc.team7195.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team7195.Robot;

import static frc.team7195.Robot.arm;


public class ArmClose extends Command {
    public ArmClose() {
        requires(arm);
    }

    @Override
    protected void initialize() {

    }

    @Override
    protected void execute() {
        arm.armClose();
    }

    @Override
    protected boolean isFinished() {
        return true;
    }

    @Override
    protected void end() {

    }

    @Override
    protected void interrupted() {
        super.interrupted();
        end();
    }
}
