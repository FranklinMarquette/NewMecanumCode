package org.usfirst.frc.team4623.robot;

import org.usfirst.frc.team4623.robot.OI;


import edu.wpi.first.wpilibj.command.Command;
/**
 * The base for all commands. All atomic commands should subclass CommandBase2013.
 * CommandBase2013 stores creates and stores each control system. To access a
 * subsystem elsewhere in your code in your code use CommandBase2013.exampleSubsystem
 * @author Author
 */
public abstract class CommandBase extends Command {

    public static OI oi;
    public static Mecanum mecanum = new Mecanum();
    public static XBox stick = new XBox(0);

    public static void init() {
        oi = new OI();

        // Show what command your subsystem is running on the SmartDashboard
        //SmartDashboard.putData(exampleSubsystem);
    }
}