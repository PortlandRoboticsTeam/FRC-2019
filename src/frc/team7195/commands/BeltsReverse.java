package frc.team7195.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team7195.subsystems.Arm;

import static frc.team7195.Robot.arm;
import static frc.team7195.subsystems.Arm.beltsReverse;


public class BeltsReverse extends Command {
    public BeltsReverse() {
        requires(arm);
    }

    @Override
    protected void initialize() {

    }

    @Override
    protected void execute() {
        beltsReverse();
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void end() {

    }

    @Override
    protected void interrupted() {
        Arm.beltsOff();
        super.interrupted();
    }
}
