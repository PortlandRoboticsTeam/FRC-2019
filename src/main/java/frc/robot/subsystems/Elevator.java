package frc.robot.subsystems;


import edu.wpi.first.wpilibj.PWMTalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Elevator extends Subsystem {

    private static PWMTalonSRX elevatorMotor = new PWMTalonSRX(5);
    
    //Set to between 0.01 and 1 to modify the force of the elevator motor
    static double elevatorForceMod = 0.5;

    public static void elevatorUp() {
        elevatorMotor.set(1*elevatorForceMod);
    } 

    public static void elevatorDown() {
        elevatorMotor.set(-1*elevatorForceMod);
    }

    public static void elevatorStop() {
        elevatorMotor.stopMotor();
    }

    public void initDefaultCommand() {

    }
}

