package org.usfirst.frc.team4623.robot.commands;

import org.usfirst.frc.team4623.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Auto extends Command {

    public Auto() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.mec);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
  
    	}

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Timer.delay(.5);
    	Robot.mec.up();
    	Timer.delay(.5);
    	Robot.mec.stopLift();
    	Timer.delay(.3);
    	Robot.mec.turnLeft();
    	Timer.delay(1);
    	Robot.mec.mecanumDrive(0, 0, 0, 0);
    	Timer.delay(.5);
    	Robot.mec.mecanumDrive(-.5, -.5, .5, .5);
    	Timer.delay(2.5);
    	Robot.mec.mecanumDrive(0, 0, 0, 0);
    	Timer.delay(.5);
        Robot.mec.down();
        Timer.delay(.3);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
