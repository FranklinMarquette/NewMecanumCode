package org.usfirst.frc.team4623.robot;


import edu.wpi.first.wpilibj.Joystick;

/**
 *
 * @author FrankyMonez
 */
public class XBox extends Joystick{
    
    public XBox(int port) {
        super(port);
    }
    
    public static final int 
            //buttons
            A_BUTTON = 0,
            B_BUTTON = 1,
            X_BUTTON = 2,
            Y_BUTTON = 3,
            START_BUTTON = 7,
            BACK_BUTTON = 6,
            RS_BUTTON = 9,
            LS_BUTTON = 8,
            RB_BUTTON = 5,
            LB_BUTTON = 4,
            //axes
            LEFTJOY_Y = 1,
            LEFTJOY_X = 0,
            RIGHTJOY_Y = 5,
            RIGHTJOY_X = 4,
            LEFT_TRIGGER = 2,
            RIGHT_TRIGGER = 3;
    
    public boolean getButtonA() {
     return getRawButton(A_BUTTON);
}
    
    public boolean getButtonB() {
        return getRawButton(B_BUTTON);
    }
    
    public boolean getButtonX() {
        return getRawButton(X_BUTTON);
    }
    
    public boolean getButtonY() {
        return getRawButton(Y_BUTTON);
    }
    
    public boolean getButtonRB() {
        return getRawButton(RB_BUTTON);
    }
    
    public boolean getButtonLB() {
        return getRawButton(LB_BUTTON);
    }
    
    public boolean getButtonRS() {
        return getRawButton(RS_BUTTON);
    }
    
    public boolean getButtonLS() {
        return getRawButton(LS_BUTTON);
    }
    
    public boolean getButtonStart() {
        return getRawButton(START_BUTTON);
    }
    
    public boolean getButtonBack() {
        return getRawButton(BACK_BUTTON);
    }
    
    public double getLeftJoyY() {
        return getRawAxis(LEFTJOY_Y);
    }
    
    public double getLeftJoyX() {
        return getRawAxis(LEFTJOY_X);
    }
    
    public double getRightJoyY() {
        return getRawAxis(RIGHTJOY_Y);
    }
    
    public double getRightJoyX(){
        return getRawAxis(RIGHTJOY_X);
    }
    
    public double getRightTrigger() {
        return getRawAxis(RIGHT_TRIGGER);
    }
    
    public double getLeftTrigger() {
    	return getRawAxis(LEFT_TRIGGER);
    }
}