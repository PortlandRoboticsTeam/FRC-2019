package frc.team7195.subsystems;


import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Arm extends Subsystem {

    public static DoubleSolenoid armValve = new DoubleSolenoid(5, 6);

    public static void solenoidPositionOne() {
        armValve.set(DoubleSolenoid.Value.kForward);
    }

    public static void solenoidPositionTwo() {
        armValve.set(DoubleSolenoid.Value.kReverse);
    }

    public static void solenoidPositionOff() {
        armValve.set(DoubleSolenoid.Value.kOff);
    }

    public void initDefaultCommand() {

    }
}

