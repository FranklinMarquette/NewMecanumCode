package org.usfirst.frc.team4623.robot.commands;

import org.usfirst.frc.team4623.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
*
* @author FrankyMonez
*/

/*****************************************
 * I changed extends to Chassis because  *
 * you were extending from command class *
 * the chassis class has information on  *
 * the methods that you need command does*
 * not                                   *
 * ***************************************/
public class TurnRight extends Command {
   
   public TurnRight() {
       requires(Robot.base);
   }

// Called just before this Command runs the first time
   protected void initialize() {
   }

   // Called repeatedly when this Command is scheduled to run
   protected void execute() {
       Robot.base.turnRight();
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
