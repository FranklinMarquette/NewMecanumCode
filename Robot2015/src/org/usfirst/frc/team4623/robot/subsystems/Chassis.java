package org.usfirst.frc.team4623.robot.subsystems;


import org.usfirst.frc.team4623.robot.commands.DriveTele;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.SpeedController;

/**
 *
 * @author FrankyMonezz
 */
public class Chassis extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    RobotDrive drive;
    
    double rspeed = .5;
    
    SpeedController frontLeftMotor = new Jaguar(0);
    SpeedController frontRightMotor = new Jaguar(1);
    SpeedController rearLeftMotor = new Jaguar(2);
    SpeedController rearRightMotor = new Jaguar(3);
    

    /*public void turnRight() {
    if(XBox.RIGHT_TRIGGER == 1) {
       mecanumDrive(-1, -1, -1, -1);
     }
 }  
    

public void turnLeft() {
        if(XBox.LEFT_TRIGGER == 1){
        	mecanumDrive(1, 1, 1, 1);
        }
 }
    
   void increment() {
         if(XBox.RIGHTJOY_Y > 0) {
            while(rspeed >= 0 && rspeed <= 1) {
              rspeed = rspeed - .1; 
        }
         }
   }
   

	void decrement() {
        if(XBox.RIGHTJOY_Y < 0){
            while(rspeed >= 0 && rspeed <= 1) {
                rspeed = rspeed -.1;
            }
        }
      }*/
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DriveTele());
    }
    
    public Chassis(){
        drive = new RobotDrive(0, 1, 2, 3);
        drive.setSafetyEnabled(false);
    }
    
   public void mecanumDrive(double FL, double RL, double FR, double RR)   {
        frontLeftMotor.set(FL);
        rearLeftMotor.set(RL);
        frontRightMotor.set(FR);
        rearRightMotor.set(RR);
    }
    
    public void setSpeed() {
        drive.setMaxOutput(rspeed);
    }
     
    public void driveAuton(double FL, double RL, double FR, double RR) {
        mecanumDrive(FL, RL, FR, RR);
}

    /*
    void decrement() {
        if(XBox.RIGHTJOY_Y < 0){
            
                rspeed = rspeed -.1;
            
        }
      }
    
   void  increment() {
         if(XBox.RIGHTJOY_Y > 0) {
            
              rspeed = rspeed - .1; 
        
      }
    }
    
    */


    
}