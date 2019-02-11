package frc.team7195.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team7195.Robot;

import static frc.team7195.Robot.arm;


public class ArmOpen extends Command {
    public ArmOpen() {
        requires(arm);
    }

    @Override
    protected void initialize() {

    }


    @Override
    protected void execute() {
        arm.armOpen();
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
