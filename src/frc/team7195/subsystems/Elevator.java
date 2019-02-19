package frc.team7195.subsystems;


import edu.wpi.first.wpilibj.PWMTalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Elevator extends Subsystem {

    private static PWMTalonSRX elevatorMotor = new PWMTalonSRX(4);

    public static void elevatorUp() {
        elevatorMotor.set(1);
    }

    public static void elevatorDown() {
        elevatorMotor.set(0);
    }

    public void initDefaultCommand() {

    }
}

