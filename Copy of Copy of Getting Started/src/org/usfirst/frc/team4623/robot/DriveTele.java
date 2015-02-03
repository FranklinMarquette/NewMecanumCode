package org.usfirst.frc.team4623.robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveTele extends Command {

    public DriveTele() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(CommandBase.stick.getLeftJoyY() > 0) {
    		CommandBase.mecanum.mecanumDrive(1, 1, -1, -1);//forward
    	}
    	
    	if(CommandBase.stick.getLeftJoyY() < 0) {
    		CommandBase.mecanum.mecanumDrive(-1, -1, 1, 1);//backward
    	}
    	
    	if (CommandBase.stick.getLeftJoyX() > 0) {
    		CommandBase.mecanum.mecanumDrive(1, 1, 1, 1);//right turn
    	}
    	
    	if (CommandBase.stick.getLeftJoyX() < 0) {
    		CommandBase.mecanum.mecanumDrive(-1, -1, -1, -1);//left turn
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
