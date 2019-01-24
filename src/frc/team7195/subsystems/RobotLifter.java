package frc.team7195.subsystems;


import edu.wpi.first.wpilibj.PWMTalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

public class RobotLifter extends Subsystem {

    public static PWMTalonSRX liftRight = new PWMTalonSRX(1);
    public static PWMTalonSRX liftLeft = new PWMTalonSRX(2);

    public static void liftRobot(float speedMod) {
        liftRight.set(1 * speedMod);
        liftLeft.set(1* speedMod);

    }

    public static void lowerRobot(float speedMod) {
        liftRight.set(-1 * speedMod);
        liftLeft.set(-1* speedMod);

    }

    public static void stopLift() {
        liftRight.stopMotor();
        liftLeft.stopMotor();
    }

    public void initDefaultCommand() {

    }
}

