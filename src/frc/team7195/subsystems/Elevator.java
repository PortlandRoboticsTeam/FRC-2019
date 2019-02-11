package frc.team7195.subsystems;


import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Elevator extends Subsystem {

    private static PWMVictorSPX elevatorMotorRight = new PWMVictorSPX(0);
    private static PWMVictorSPX elevatorMotorLeft = new PWMVictorSPX(1);

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

