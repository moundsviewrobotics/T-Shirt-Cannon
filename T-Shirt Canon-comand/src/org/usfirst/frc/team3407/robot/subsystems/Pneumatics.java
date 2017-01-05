package org.usfirst.frc.team3407.robot.subsystems;

//import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public  class Pneumatics extends Subsystem {
	private Solenoid X = new Solenoid (3);
	private Solenoid Y = new Solenoid (0);
	private Solenoid B = new Solenoid (1);
	private Solenoid A = new Solenoid (2);
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public void initDefaultCommand(){
		//leave blank
	}
    
    public void shoota() {
    	A.set(true);
    	Timer.delay(0.1);
    	A.set(false);
    }
    public void shootb(){
    	B.set(true);
    	Timer.delay(0.1);
    	B.set(false);
    }
    public void shootx(){
    	X.set(true);
    	Timer.delay(0.1);
    	X.set(false);
    }
    public void shooty(){
    	Y.set(true);
    	Timer.delay(0.1);
    	Y.set(false);
    }
    public void stop(){
    	A.set(false);
    	B.set(false);
    	X.set(false);
    	Y.set(false);
    }
}

