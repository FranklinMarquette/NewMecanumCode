package org.usfirst.frc.team4623.robot;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Mecanum extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	SpeedController frontLeftMotor = new Jaguar(0);
    SpeedController frontRightMotor = new Jaguar(1);
    SpeedController rearLeftMotor = new Jaguar(2);
    SpeedController rearRightMotor = new Jaguar(3);
	
    public RobotDrive drive = new RobotDrive(frontLeftMotor, 
    		                                 rearLeftMotor, 
    		                                 frontRightMotor, 
    		                                 rearRightMotor);
	

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DriveTele());
    }
    
    public void mecanumDrive(double FL, double RL, double FR, double RR)   {
        frontLeftMotor.set(FL);
        rearLeftMotor.set(RL);
        frontRightMotor.set(FR);
        rearRightMotor.set(RR);
    }
    
    public void driveTele(double moveValue, double turnValue){
        drive.arcadeDrive(moveValue, turnValue);
    }
    
    public void setSpeed(double speed){
        drive.setMaxOutput(speed);
    }
}

