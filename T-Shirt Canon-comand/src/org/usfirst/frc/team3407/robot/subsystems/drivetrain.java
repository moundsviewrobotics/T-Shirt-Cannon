package org.usfirst.frc.team3407.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
//import edu.wpi.first.wpilibj.SpeedController;
//import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

//import org.usfirst.frc.team3407.robot.OI;
import org.usfirst.frc.team3407.robot.commands.*;;

/**
 *
 */
public class drivetrain extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private RobotDrive drive;
	public drivetrain() {
		drive = new RobotDrive(0, 1);
		drive.setMaxOutput(0.5);
		drive.setSafetyEnabled(true);
		drive.setSensitivity(0.75);
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
    	drive.drive(0, 0);
    }
}

