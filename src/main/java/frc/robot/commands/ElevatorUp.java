package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.subsystems.Elevator;

public class ElevatorUp extends Command {
    public ElevatorUp() {
        //requires(elevator);
    }


    @Override
    protected void initialize() {

    }

    @Override
    protected void execute() {
        Elevator.elevatorUp();
    }


    @Override
    protected boolean isFinished() {
        //May need to be inverted
        return !Robot.elevSwitchTop.get();
        //return false;
    }

    @Override
    protected void end() {
        Elevator.elevatorStop();
    }

    @Override
    protected void interrupted() {
        super.interrupted();
        Elevator.elevatorStop();
    }
}
