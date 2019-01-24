/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.team7195;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

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
public class OI 
{
    //Declare joysticks
    public static Joystick m_stick = new Joystick(0);
    public static Joystick s_stick = new Joystick(1);

    //Declare buttons
    public static Button rightTrigger = new JoystickButton(m_stick, 1);
    public static Button leftTrigger = new JoystickButton(s_stick, 1);
    public static Button lift = new JoystickButton(m_stick, 12);
    public static Button lower = new JoystickButton(m_stick, 11);
    public static Button stopLifter = new JoystickButton(m_stick, 9);

    //Assign commands to buttons
}
