package frc.team7195.subsystems;


import edu.wpi.first.wpilibj.PWMTalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Elevator extends Subsystem {

    public static PWMTalonSRX elevatorMotor = new PWMTalonSRX(0);

    public static void elevatorUp() {
        elevatorMotor.set(0);
    }

    public static void elevatorDown() {
        elevatorMotor.set(1);
    }

    public void initDefaultCommand() {

    }
}

