package org.usfirst.frc.team4623.robot.commands;

import org.usfirst.frc.team4623.robot.OI;
import org.usfirst.frc.team4623.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 * @author FrankyMonez
 */
public class DriveTele extends Command {
    
    OI oI = new OI();
    
    public DriveTele() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(Robot.base);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        Robot.base.mecanumDrive(
                (Robot.oi.joystick.getLeftJoyX()+Robot.oi.joystick.getLeftJoyY())/2,
                (Robot.oi.joystick.getLeftJoyY()-Robot.oi.joystick.getLeftJoyX())/2,
                -(Robot.oi.joystick.getLeftJoyY()-Robot.oi.joystick.getLeftJoyX())/2,
                -(Robot.oi.joystick.getLeftJoyX()+Robot.oi.joystick.getLeftJoyY())/2);
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
