/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc.team4623.robot.commands;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 * @author FrankyMonez
 */
public class Solenoid1 extends Command {
	
    DoubleSolenoid ds = new DoubleSolenoid(1, 2);
    
    public Solenoid1() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        
        setTimeout(1);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        ds.set(DoubleSolenoid.Value.kForward);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
        ds.set(DoubleSolenoid.Value.kReverse);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
