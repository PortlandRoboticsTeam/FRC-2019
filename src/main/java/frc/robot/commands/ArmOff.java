package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.subsystems.Arm;


public class ArmOff extends Command {
    public ArmOff() {
        //requires(Robot.arm);
    }

    @Override
    protected void initialize() {

    }

    @Override
    protected void execute() {
        Arm.armOff();

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
    }
}
