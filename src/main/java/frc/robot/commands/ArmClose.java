package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.subsystems.Arm;


public class ArmClose extends Command {
    public ArmClose() {
        //requires(arm);
    }

    @Override
    protected void initialize() {

    }

    @Override
    protected void execute() {
        Arm.armClose();
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
