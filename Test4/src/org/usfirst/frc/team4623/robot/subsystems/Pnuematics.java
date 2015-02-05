package org.usfirst.frc.team4623.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Pnuematics extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	DoubleSolenoid ds = new DoubleSolenoid(0, 1);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void extend() {
    	ds.set(DoubleSolenoid.Value.kForward);
    }
    
    public void retract() {
    	ds.set(DoubleSolenoid.Value.kReverse);
    }
}

