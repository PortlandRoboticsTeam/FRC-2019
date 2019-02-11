package frc.team7195.subsystems;


import edu.wpi.first.wpilibj.PWMTalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Elevator extends Subsystem {

    public static PWMTalonSRX elevatorMotorRight = new PWMTalonSRX(0);
    public static PWMTalonSRX elevatorMotorLeft = new PWMTalonSRX(0);

    public static void elevatorUp() {
        elevatorMotorRight.set(1);
        elevatorMotorLeft.set(1);
    }

    public static void elevatorDown() {
        elevatorMotorRight.set(0);
        elevatorMotorLeft.set(0);
    }

    public void initDefaultCommand() {

    }
}

