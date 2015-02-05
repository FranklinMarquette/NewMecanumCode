
package org.usfirst.frc.team4623.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

import org.usfirst.frc.team4623.robot.commands.ExampleCommand;
import org.usfirst.frc.team4623.robot.subsystems.ExampleSubsystem;
import org.usfirst.frc.team4623.robot.subsystems.Pnuematics;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
      SpeedController frontLeftMotor = new Jaguar(0);
      SpeedController frontRightMotor = new Jaguar(1);
      SpeedController rearLeftMotor = new Jaguar(2);
      SpeedController rearRightMotor = new Jaguar(3);

	public static final ExampleSubsystem exampleSubsystem = new ExampleSubsystem();
	public static final Pnuematics pn = new Pnuematics();
	public static OI oi;

    Command autonomousCommand;

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
		oi = new OI();
        // instantiate the command used for the autonomous period
        autonomousCommand = new ExampleCommand();
    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

    public void autonomousInit() {
        // schedule the autonomous command (example)
        if (autonomousCommand != null) autonomousCommand.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
		// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) autonomousCommand.cancel();
        
      
        
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    public void disabledInit(){

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        
        mecanumDrive(
                (oi.stick.getLeftJoyX()+oi.stick.getLeftJoyY())/2,
                (oi.stick.getLeftJoyY()-oi.stick.getLeftJoyX())/2,
                -(oi.stick.getLeftJoyY()-oi.stick.getLeftJoyX())/2,
                -(oi.stick.getLeftJoyX()+oi.stick.getLeftJoyY())/2);
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
    
    public void mecanumDrive(double FL, double RL, double FR, double RR)   {
        frontLeftMotor.set(-FL);
        rearLeftMotor.set(-RL);
        frontRightMotor.set(-FR);
        rearRightMotor.set(-RR);
    }
}
