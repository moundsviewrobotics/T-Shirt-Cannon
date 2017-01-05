
package org.usfirst.frc.team3407.robot;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
    //final String defaultAuto = "Default";
    //final String customAuto = "My Auto";
    //String autoSelected;
    //SendableChooser chooser;
	Compressor c = new Compressor (0);
	Solenoid X = new Solenoid (3);
	Solenoid Y = new Solenoid (0);
	Solenoid B = new Solenoid (1);
	Solenoid A = new Solenoid (2);
	Joystick stick = new Joystick (1);
	RobotDrive drive = new RobotDrive(0,1);
	Button buttona = new JoystickButton(stick, 1),
			buttonb = new JoystickButton(stick,2),
			buttonx = new JoystickButton(stick,3),
			buttony = new JoystickButton(stick,4),
			buttonr = new JoystickButton(stick,6);
	
	

	
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
        /*chooser = new SendableChooser();
        chooser.addDefault("Default Auto", defaultAuto);
        chooser.addObject("My Auto", customAuto);
        SmartDashboard.putData("Auto choices", chooser);*/
    	drive.setSafetyEnabled(true);
    	drive.setSensitivity(0.75);
    }
    
	/**
	 * This autonomous (along with the chooser code above) shows how to select between different autonomous modes
	 * using the dashboard. The sendable chooser code works with the Java SmartDashboard. If you prefer the LabVIEW
	 * Dashboard, remove all of the chooser code and uncomment the getString line to get the auto name from the text box
	 * below the Gyro
	 *
	 * You can add additional auto modes by adding additional comparisons to the switch structure below with additional strings.
	 * If using the SendableChooser make sure to add them to the chooser code above as well.
	 */
    public void autonomousInit() {

    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
    
        //Put custom auto code here   
 
    	//Put default auto code here
    
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
    	while (isOperatorControl() && isEnabled()) {
    		boolean buttonA = stick.getRawButton(1);
    		boolean buttonB = stick.getRawButton(2);
    		boolean buttonX = stick.getRawButton(3);
    		boolean buttonY = stick.getRawButton(4);
    		boolean buttonR = stick.getRawButton(6);
    		//double differential = Math.abs(stick.getX() / 4);
    		c.setClosedLoopControl(true);
    		//drive.arcadeDrive(stick);
    		drive.drive(stick.getRawAxis(3)*0.75, stick.getX());
    		if (buttonR == true){
        		drive.drive(stick.getRawAxis(3)*-0.75, -stick.getX()*-1);

    		}
    		
    		
    		
    		if(buttonA == true){
    			A.set(true);
    			Timer.delay(0.1);
    			A.set(false);
    		}
    		if (buttonB == true){
    			B.set(true);
    			Timer.delay(0.1);
    			B.set(false);
    		}
    		if (buttonX == true){
    			X.set(true);
    			Timer.delay(0.1);
    			X.set(false);
    		}
    		if (buttonY == true){
    			Y.set(true);
    			Timer.delay(0.1);
    			Y.set(false);
    		}
    		else {
    			A.set(false);
    			B.set(false);
    			X.set(false);
    			Y.set(false);
    			
    		}
    		}
    		
    	}
    	
    	
    	
    	
        

    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
}
