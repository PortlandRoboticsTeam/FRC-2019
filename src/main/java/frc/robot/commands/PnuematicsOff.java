package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.subsystems.Arm;


public class PnuematicsOff extends Command {
    public PnuematicsOff() {
        //requires(Robot.arm);
    }

    @Override
    protected void initialize() {

    }

    @Override
    protected void execute() {
        Arm.armOff();
        Robot.compressor.setClosedLoopControl(false);
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
