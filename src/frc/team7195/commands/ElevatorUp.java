package frc.team7195.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team7195.Robot;

import static frc.team7195.Robot.elevator;


public class ElevatorUp extends Command {
    public ElevatorUp() {
        requires(elevator);
    }


    @Override
    protected void initialize() {

    }

    @Override
    protected void execute() {
        elevator.elevatorUp();
    }


    @Override
    protected boolean isFinished() {
        //May need to be inverted
        return Robot.elevSwitchTop.get();
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
