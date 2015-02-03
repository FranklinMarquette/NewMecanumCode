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
    	CommandBase.mecanum.setSpeed(.3);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	CommandBase.mecanum.driveTele(CommandBase.stick.getLeftJoyY(), CommandBase.stick.getLeftJoyX());
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
