package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.subsystems.Arm;

import static frc.robot.subsystems.Arm.beltsForward;


public class BeltsForward extends Command {
    public BeltsForward() {
        //requires(Robot.arm);
    }

    @Override
    protected void initialize() {

    }

    @Override
    protected void execute() {
        Arm.beltsForward();
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
