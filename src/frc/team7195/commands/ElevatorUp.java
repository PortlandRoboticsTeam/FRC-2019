package frc.team7195.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team7195.Robot;


public class ElevatorUp extends Command {
    public ElevatorUp(boolean moveToSensor) {
        requires(Robot.elevator);
    }


    @Override
    protected void initialize() {

    }

    @Override
    protected void execute() {

    }


    @Override
    protected boolean isFinished() {
        //May need to be inverted
        return Robot.elevSwitchBottom.get();
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
