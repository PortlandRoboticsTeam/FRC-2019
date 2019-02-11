package frc.team7195.commands;
import edu.wpi.first.wpilibj.command.Command;
import frc.team7195.Robot;
import frc.team7195.subsystems.Drivetrain;


public class DriveModeSet extends Command {
    public DriveModeSet(int mode) {
        requires(Robot.drivetrain);
        if(mode == 0) {
            Drivetrain.tankDrive();
        }

        if(mode == 0) {
            Drivetrain.standardDrive();
        }

        if(mode == 0) {
            Drivetrain.curvatureDrive();
        }

        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    @Override
    protected boolean isFinished() {
        return true;
    }
}
