package frc.robot.subsystems;


import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Arm extends Subsystem {

    private static DoubleSolenoid armValve = new DoubleSolenoid(4, 5);
    private static PWMVictorSPX rightBelts = new PWMVictorSPX(0);
    private static PWMVictorSPX leftBelts = new PWMVictorSPX(1);

    //Set to between 0.01 and 1 for percent mod of speed
    static double beltsSpeedMod = 1.0;

    public static void armOpen() {
        armValve.set(DoubleSolenoid.Value.kForward);
    }

    public static void armClose() {
        armValve.set(DoubleSolenoid.Value.kReverse);
    }

    public static void armOff() {
        armValve.set(DoubleSolenoid.Value.kOff);
    }

    public static void beltsForward() {
        rightBelts.set(1*beltsSpeedMod);
        leftBelts.set(-1*beltsSpeedMod);
    }

    public static void beltsReverse() {
        rightBelts.set(-1*beltsSpeedMod);
        leftBelts.set(1*beltsSpeedMod);
    }

    public static void beltsOff() {
        rightBelts.stopMotor();
        leftBelts.stopMotor();
    }

    public void initDefaultCommand() {
        
    }
}

