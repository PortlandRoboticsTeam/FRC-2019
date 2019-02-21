package frc.team7195.subsystems;


import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Arm extends Subsystem {

    private static DoubleSolenoid armValve = new DoubleSolenoid(4, 5);
    private static PWMVictorSPX rightBelts = new PWMVictorSPX(0);
    private static PWMVictorSPX leftBelts = new PWMVictorSPX(1);

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
        rightBelts.set(1);
        leftBelts.set(1);
    }

    public static void beltsReverse() {
        rightBelts.set(-1);
        leftBelts.set(-1);
    }

    public static void beltsOff() {
        rightBelts.set(0);
        leftBelts.set(0);
    }

    public void initDefaultCommand() {

    }
}

