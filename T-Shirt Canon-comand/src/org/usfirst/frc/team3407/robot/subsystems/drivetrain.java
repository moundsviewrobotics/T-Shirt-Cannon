package org.usfirst.frc.team3407.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Victor;
//import edu.wpi.first.wpilibj.SpeedController;
//import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

//import org.usfirst.frc.team3407.robot.OI;
import org.usfirst.frc.team3407.robot.commands.*;;

/**
 *
 */
public class drivetrain extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private DifferentialDrive drive;
	public drivetrain() {
		drive = new DifferentialDrive(new Victor(0), new Victor(1));
		drive.setMaxOutput(0.5);
		drive.setSafetyEnabled(true);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new drive());
    }
    public void tankDrive(Joystick stick){
    	drive.tankDrive(-(stick.getRawAxis(1)), -(stick.getRawAxis(5)));
    }
    
    public void stop(){
    	drive.tankDrive(0, 0);
    }
}

