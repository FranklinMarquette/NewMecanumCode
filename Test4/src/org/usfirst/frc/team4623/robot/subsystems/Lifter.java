package org.usfirst.frc.team4623.robot.subsystems;


import org.usfirst.frc.team4623.robot.commands.liftStop;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Lifter extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	SpeedController win = new Talon(4);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new liftStop());
    }
    
    public void up() {
    	win.set(1);
    }
    
    public void down() {
    	win.set(-1);
    }
    
    public void stop() {
    	win.set(0);
    }
}

