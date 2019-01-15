package frc.team7195.subsystems;


import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.team7195.OI;


public class Drivetrain extends Subsystem {

    /**
     * Subsystems are used to group hardware and define ways it is used.
     *
     * In this class you declare the motor controllers and related
     * hardware and define the ways this system is used. For example, different
     * joystick driving methods and autonomous driving code goes here.
     **/

    private static Spark frontRight = new Spark(1);
    private static Spark rearRight = new Spark(2);
    private static Spark frontLeft = new Spark(3);
    private static Spark rearLeft = new Spark(4);
    //static AnalogGyro m_gyro = new AnalogGyro(1);

    private static SpeedControllerGroup right = new SpeedControllerGroup(frontRight, rearRight);
    private static SpeedControllerGroup left = new SpeedControllerGroup(frontLeft, rearLeft);

    private static DifferentialDrive drive = new DifferentialDrive(right, left);

    public static void tankDrive() { drive.tankDrive(OI.m_stick.getX(), OI.s_stick.getX()); }

    public static void curvatureDrive() { drive.curvatureDrive(OI.m_stick.getX(), OI.m_stick.getZ(), true); }

    public static void standardDrive() { drive.arcadeDrive(OI.m_stick.getX(), OI.m_stick.getY()); }

    public void initDefaultCommand() {
        //setDefaultCommand(new ExampleCommand());
    }
}

