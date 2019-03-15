package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.OI;


public class Drivetrain extends Subsystem {
    //Sparks at 8 and 9, 6 on talon, 0 and 1 on victor

    private static Spark right = new Spark(8);
    private static Spark left = new Spark(9);

    private static DifferentialDrive drive = new DifferentialDrive(right, left);

    public static void tankDrive(Joystick m_stick, Joystick s_stick) { drive.tankDrive(m_stick.getY()*((m_stick.getThrottle()+1)/1.5), (s_stick.getY()*((m_stick.getThrottle()+1)/1.5))); }

    public static void curvatureDrive() { drive.curvatureDrive(OI.m_stick.getX(), OI.m_stick.getZ(), true); }

    public static void standardDrive() { drive.arcadeDrive(OI.m_stick.getX(), OI.m_stick.getY()); }

    public static void stop() { drive.stopMotor(); }

    public void initDefaultCommand() {
        //setDefaultCommand(new TankDrive());
    }
}

