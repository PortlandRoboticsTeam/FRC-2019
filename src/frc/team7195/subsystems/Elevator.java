package frc.team7195.subsystems;


import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Elevator extends Subsystem {

    private static PWMVictorSPX elevatorMotor = new PWMVictorSPX(4);

    public static void elevatorUp() {
        elevatorMotor.set(1);
    }

    public static void elevatorDown() {
        elevatorMotor.set(0);
    }

    public void initDefaultCommand() {

    }
}

