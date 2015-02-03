package org.usfirst.frc.team4623.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    	
    	CommandBase.init();
    	
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
    	CommandBase.mecanum.mecanumDrive(.3, .3, -.3, -.3);//forwards
    	//mecanumDrive(-.3, -.3, .3, .3);//backwards
    	//mecanumDrive(-.3, -.3, -.3, -.3);//turn left
    	//mecanumDrive(.3, .3, .3, .3);//turn right
    	//mecanumDrive(.3, -.3, .3, -.3);//straffe right
    	//mecanumDrive(-.3, .3, -.3, .3);//straffe left
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
    
      }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    	LiveWindow.run();
    }
    
}


