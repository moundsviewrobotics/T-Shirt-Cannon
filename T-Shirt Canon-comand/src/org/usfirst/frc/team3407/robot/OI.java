package org.usfirst.frc.team3407.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team3407.robot.commands.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	static OI instance;
	Joystick stick = new Joystick(1);
	Button buttona = new JoystickButton(stick, 1),
			buttonb = new JoystickButton(stick,2),
			buttonx = new JoystickButton(stick,3),
			buttony = new JoystickButton(stick,4);
	
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
	public OI(){
		
		//buttona.whenPressed(new shoot());
		buttonb.whenPressed(new shootb());
		buttona.whenPressed(new shoot());
		buttonx.whenPressed(new shootx());
		buttony.whenPressed(new shooty());
	}
	
	public Joystick getJoystick() {
		return stick;
	}
	/*public Boolean getButtonX() {
		return buttonX;
	}
	public Boolean getButtonY() {
		return buttonY;
	}
	public Boolean getButtonA() {
		return buttonA;
	}
	public Boolean geButtonB() {
		return buttonB;
	}*/
	public static OI getInstance(){
		if(instance == null){
			instance = new OI();
			
		}
		return instance;
	}
}

