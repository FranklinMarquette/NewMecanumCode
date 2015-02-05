package org.usfirst.frc.team4623.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	
	public XBox stick = new XBox(0);
	
	SpeedController frontLeftMotor = new Jaguar(0);
    SpeedController frontRightMotor = new Jaguar(1);
    SpeedController rearLeftMotor = new Jaguar(2);
    SpeedController rearRightMotor = new Jaguar(3);
	
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    	
    }
    
    /**
     * This function is run once each time the robot enters autonomous mode
     */
    public void autonomousInit() {
    	
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
    
    }
    
    /**
     * This function is called once each time the robot enters tele-operated mode
     */
    public void teleopInit(){
    	
    	
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        
                   mecanumDrive(
                    (stick.getLeftJoyX()+stick.getLeftJoyY())/2,
                    (stick.getLeftJoyY()-stick.getLeftJoyX())/2,
                    -(stick.getLeftJoyY()-stick.getLeftJoyX())/2,
                    -(stick.getLeftJoyX()+stick.getLeftJoyY())/2);
      
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


