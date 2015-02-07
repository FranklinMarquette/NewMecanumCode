package org.usfirst.frc.team4623.robot.subsystems;

import org.usfirst.frc.team4623.robot.commands.DriveTele;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *test
 */
public class Mecanum extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	SpeedController frontLeftMotor = new Jaguar(0);
    SpeedController frontRightMotor = new Jaguar(1);
    SpeedController rearLeftMotor = new Jaguar(2);
    SpeedController rearRightMotor = new Jaguar(3);
	

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DriveTele());
    }
    
    public void mecanumDrive(double FL, double RL, double FR, double RR)   {
        frontLeftMotor.set(-FL);
        rearLeftMotor.set(-RL);
        frontRightMotor.set(-FR);
        rearRightMotor.set(-RR);
    }
    
    public void turnLeft() {
    	mecanumDrive(-1, -1, -1, -1);
    }
    
    public void turnRight() {
    	mecanumDrive(1, 1, 1, 1);
    }
    
    public void stop() {
    	mecanumDrive(0, 0, 0, 0);
    }
}
