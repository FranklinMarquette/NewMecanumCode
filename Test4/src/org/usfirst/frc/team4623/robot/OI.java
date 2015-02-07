package org.usfirst.frc.team4623.robot;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team4623.robot.commands.baseStop;
import org.usfirst.frc.team4623.robot.commands.extend;
import org.usfirst.frc.team4623.robot.commands.liftStop;
import org.usfirst.frc.team4623.robot.commands.retract;
import org.usfirst.frc.team4623.robot.commands.raise;
import org.usfirst.frc.team4623.robot.commands.lower;
import org.usfirst.frc.team4623.robot.commands.rightTurn;
import org.usfirst.frc.team4623.robot.commands.leftTurn;
import org.usfirst.frc.team4623.robot.subsystems.XBox;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
	
	public XBox stick = new XBox(0);
	
	private Button extend = new JoystickButton(stick, XBox.X_BUTTON);
	private Button retract = new JoystickButton(stick, XBox.Y_BUTTON);
	
	private Button raise = new JoystickButton(stick, XBox.LS_BUTTON);
	private Button raiseStop = new JoystickButton(stick, XBox.LS_BUTTON);
	private Button lower = new JoystickButton(stick, XBox.RS_BUTTON);
	private Button lowerStop = new JoystickButton(stick, XBox.RS_BUTTON);
	
	private Button leftTurn = new JoystickButton(stick, XBox.LB_BUTTON);
	private Button rightTurn = new JoystickButton(stick, XBox.RB_BUTTON);
	private Button stop = new JoystickButton(stick, XBox.LB_BUTTON);
	private Button stop2 = new JoystickButton(stick, XBox.RB_BUTTON);
	
	public OI() {
		
		extend.whenPressed(new extend());
		retract.whenPressed(new retract());
		
		raise.whenPressed(new raise());
		lower.whenPressed(new lower());
		
		raiseStop.whenReleased(new liftStop());
		lowerStop.whenReleased(new liftStop());
		
		
		leftTurn.whenPressed(new leftTurn());
		rightTurn.whenPressed(new rightTurn());
		
		stop.whenReleased(new baseStop());
		stop2.whenReleased(new baseStop());
		
		}
}

