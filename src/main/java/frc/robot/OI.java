/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.*;

/**
 * This class binds the controls on the physical operator interface
 * to the commands and command groups that allow control of the robot.
 *
 * Sticks are declared with:
 * Joystick stick = new Joystick(port);
 *
 * Buttons are declared with:
 * Button button = new JoystickButton(stick, buttonNumber);
 * There are also several built-in buttons that you can ues.
 *
 * Commands are triggered with buttons using:
 * button.whenPressed(new ExampleCommand());
 * button.whileHeld(new ExampleCommand());
 * button.whenReleased(new ExampleCommand());
 */
public class OI {
    //Declare joysticks
    public static Joystick m_stick = new Joystick(0);
    public static Joystick s_stick = new Joystick(1);
    
    //Declare buttons
    private static Button rightTrigger = new JoystickButton(m_stick, 1);
    private static Button leftTrigger = new JoystickButton(s_stick, 1);
    private static Button buttonThree = new JoystickButton(m_stick, 3);
    private static Button buttonFour = new JoystickButton(m_stick, 4);
    private static Button buttonFive = new JoystickButton(m_stick, 5);
    private static Button buttonSix = new JoystickButton(m_stick, 6);
    private static Button s_buttonTwelve = new JoystickButton(s_stick, 12);
    private static Button m_buttonTwelve = new JoystickButton(s_stick, 12);
    private static Button altButtonThree = new JoystickButton(s_stick, 3);
    private static Button altButtonFour = new JoystickButton(s_stick, 4);
    private static Button altButtonFive = new JoystickButton(s_stick, 5);
    private static Button altButtonSix = new JoystickButton(s_stick, 6);
    
    //Assign commands to buttons
    OI() {
        
        //Maps elevator controls to buttons 3-6 on main stick
        buttonThree.whileHeld(new ElevatorDown());
        buttonFour.whileHeld(new ElevatorUp());
        //buttonFive.toggleWhenPressed(new ElevatorDown());
        //buttonSix.toggleWhenPressed(new ElevatorUp());
        
        //Maps arm button controls to buttons 3-6 on second stick
        altButtonThree.whileHeld(new BeltsReverse());
        altButtonFour.whileHeld(new BeltsForward());
        altButtonFive.whenPressed(new BeltsOff());
        altButtonSix.whenPressed(new ArmOff());

        //Maps arm controls to triggers
        rightTrigger.whenPressed(new ArmClose());
        leftTrigger.whenPressed(new ArmOpen());

        //Maps other functions to base buttons
        //s_buttonTwelve.whenPressed(new SwitchCamera());
        //m_buttonTwelve.whenPressed(new PnuematicsOff());
        
    }





}
