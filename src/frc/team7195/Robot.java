/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.team7195;

import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.team7195.commands.AltAutonomous;
import frc.team7195.commands.BaseAutonomous;
import frc.team7195.subsystems.Drivetrain;


public class Robot extends TimedRobot 
{

    public static final Drivetrain Drivetrain = new Drivetrain();
    public static OI oi;

    private Command autonomousCommand;
    private SendableChooser<Command> chooser = new SendableChooser<>();

    /**
     * This function is run when the robot is first started up and is
     * used for any initialization code.
     */
    @Override
    public void robotInit() 
    {
        oi = new OI();
        //CameraServer.getInstance().startAutomaticCapture();

        //Allows selection of autonomous mode for SmartDashboard
        chooser.addDefault("Default Auto", new BaseAutonomous());
        chooser.addObject("Secondary Auto", new AltAutonomous());
        SmartDashboard.putData("Auto mode", chooser);

        //Pushes data from robot to SmartDashboard
        SmartDashboard.putData("PDP Info", new PowerDistributionPanel(1));
        SmartDashboard.putData("Built in Accelerometer", new BuiltInAccelerometer());
        SmartDashboard.putData("Drivetrain", new Drivetrain());
    }

    /**
     * This function is called once each time the robot enters Disabled mode
     * (generally when the game ends) You can use it to reset any subsystem
     * information you want to clear when the robot is disabled.
     */
    @Override
    public void disabledInit() 
    {
        
    }

    @Override
    public void disabledPeriodic() 
    {
        Scheduler.getInstance().run();
    }

    /**
     * This code helps set up the autonomous by accepting input from the
     * sendableChooser above.
     */
    @Override
    public void autonomousInit() 
    {
        autonomousCommand = chooser.getSelected();

        // Schedules the autonomous command
        if (autonomousCommand != null) 
        {
            autonomousCommand.start();
        }
    }

    /**
     * This function is called periodically during autonomous.
     */
    @Override
    public void autonomousPeriodic() 
    {
        Scheduler.getInstance().run();
        Drivetrain.mecanumDrive();
    }

    @Override
    public void teleopInit() 
    {
        // This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to
        // continue until interrupted by another command, remove it

        if (autonomousCommand != null) 
        {
            autonomousCommand.cancel();
        }
    }

    /**
     * This function is called periodically during operator control.
     */
    @Override
    public void teleopPeriodic() 
    {
        Scheduler.getInstance().run();

    }

    /**
     * This function is called periodically during test mode.
     */
    @Override
    public void testPeriodic() 
    {
        
    }
}
