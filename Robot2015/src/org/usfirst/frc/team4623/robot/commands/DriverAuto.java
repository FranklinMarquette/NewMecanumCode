/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc.team4623.robot.commands;

import org.usfirst.frc.team4623.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
*
* @author FrankyMonez
*/
public class DriverAuto extends Command {
   
   public DriverAuto() {
       // Use requires() here to declare subsystem dependencies
       requires(Robot.base);
   }

   // Called just before this Command runs the first time
   protected void initialize() {
       setTimeout(2);
   }

   // Called repeatedly when this Command is scheduled to run
   protected void execute() {
       Robot.base.driveAuton(1, -1, 1, -1);
   }

   // Make this return true when this Command no longer needs to run execute()
   protected boolean isFinished() {
       return isTimedOut();
   }

   // Called once after isFinished returns true
   protected void end() {
       Robot.base.driveAuton(0, 0, 0, 0);
   }

   // Called when another command which requires one or more of the same
   // subsystems is scheduled to run
   protected void interrupted() {
       end();
   }
}
