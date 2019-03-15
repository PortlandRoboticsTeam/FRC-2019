package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.subsystems.Elevator;


public class ElevatorDown extends Command {
    public ElevatorDown() {
        //requires(elevator);
    }

    @Override
    protected void initialize() {

    }

    @Override
    protected void execute() {
        Elevator.elevatorDown();
    }

    @Override
    protected boolean isFinished() {
        //May need to be inverted
        return !Robot.elevSwitchBottom.get();
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
