package org.usfirst.frc.team4623.robot.commands;

import org.usfirst.frc.team4623.robot.OI;
import org.usfirst.frc.team4623.robot.Robot;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveTele extends Command {
	
	public static OI oi = new OI();
	
	DigitalInput limitSwitch = new DigitalInput(2);
    DigitalInput limitSwitch2 = new DigitalInput(1);
	
    public DriveTele() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.mec);
    	   	}

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.mec.mecanumDrive(
                (oi.stick.getLeftJoyX()+oi.stick.getLeftJoyY())/2,
                (oi.stick.getLeftJoyY()-oi.stick.getLeftJoyX())/2,
                -(oi.stick.getLeftJoyY()-oi.stick.getLeftJoyX())/2,
                -(oi.stick.getLeftJoyX()+oi.stick.getLeftJoyY())/2);
    	
    	if(oi.stick.getRawButton(6)) {
    		Robot.mec.turnLeft();
    	}
    	
    	else if(oi.stick.getRawButton(5)){
    		Robot.mec.turnRight();
    	}
    	
    	if(oi.stick.getRawButton(1) && limitSwitch.get()) {
    		Robot.mec.down();
    	}
    	
    	else if(oi.stick.getRawButton(4) && limitSwitch2.get()) {
    		Robot.mec.up();
    	}
    	
    	else {
    		Robot.mec.stopLift();
    	}
    } 

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
