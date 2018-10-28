package frc.team7195.subsystems;


import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.MecanumDrive;

import static frc.team7195.Robot.oi;

public class Drivetrain extends Subsystem {

    /**
     * Subsystems are used to group hardware and define ways it is used.
     *
     * In this class you declare the motor controllers and related
     * hardware and define the ways this system is used. For example, different
     * joystick driving methods and autonomous driving code goes here.
     **/

    static Spark frontRight = new Spark(1);
    static Spark rearRight = new Spark(2);
    static Spark frontLeft = new Spark(3);
    static Spark rearLeft = new Spark(4);
    //static AnalogGyro m_gyro = new AnalogGyro(1);

    public static MecanumDrive drive = new MecanumDrive(frontRight, rearRight, frontLeft, rearLeft);

    public static void mecanumDrive() {
        drive.driveCartesian(oi.m_stick.getX(), oi.m_stick.getY(), oi.m_stick.getZ()/*, m_gyro.getAngle()*/);
    }


    public void initDefaultCommand() {
        //setDefaultCommand(new ExampleCommand());
    }
}

