package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.subsystems.Drivetrain;


public class DriveModeSet extends Command {
    public DriveModeSet(int mode) {
        //requires(Robot.drivetrain);
        if(mode == 0) {
            Drivetrain.tankDrive(OI.m_stick, OI.s_stick);
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
