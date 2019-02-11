package frc.team7195.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team7195.Robot;


public class BaseAutonomous extends Command {
    public BaseAutonomous() {
        requires(Robot.drivetrain);
    }


    /**
     * The initialize method is called just before the first time
     * this Command is run after being started.
     */
    @Override
    protected void initialize() {

    }


    /**
     * The execute method is called repeatedly while this Command is
     * scheduled to run until this Command either finishes or is canceled.
     */
    @Override
    protected void execute() {

    }


    /**
     * Returns whether this command is finished. If it is, then the command will be removed and
     * end() will be called.
     * If this class returns true, the command finishes, if it returns false, the command will continue.
     */
    @Override
    protected boolean isFinished() {
        return false;
    }


    /**
     * Called once when the command ended peacefully; that is it is called once
     * after isFinished() returns true. Used to wrap up loose ends.
     */
    @Override
    protected void end() {

    }


    /**
     * Called when the command ends because somebody called cancel() or
     * another command shared the same requirements as this one, and booted it out. For example,
     * it is called when another command which requires one or more of the same
     * subsystems is scheduled to run. Generally, it is useful to simply call the
     * end() method here
     */
    @Override
    protected void interrupted() {
        super.end();
    }
}
