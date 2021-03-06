// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc1701.RobotBuild2015.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc1701.RobotBuild2015.Robot;
import org.usfirst.frc1701.RobotBuild2015.RobotMap;

/**
 *
 */
public class  WheelsToSpinPosition extends Command {

	public static final int OFFSETSTEERENCODERFL = 90;
	public static final int OFFSETSTEERENCODERFR = 270;
	public static final int OFFSETSTEERENCODERBR = 180;
	public static final int OFFSETSTEERENCODERBL = 180;
	private final double STEERSPEEDCOEFFICIENT = 1.0/180.0;
	private double angleFL = 0;
	private double angleFR = 0;
	private double angleBR = 0;
	private double angleBL = 0;
	private double steerSpeedFL = 0;
	private double steerSpeedFR = 0;
	private double steerSpeedBR = 0;
	private double steerSpeedBL = 0;
	private boolean finished = false;
	
    public WheelsToSpinPosition() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);

        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.drivetrain);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	finished = false;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	finished = false;

		angleFL = (RobotMap.drivetrainSteerEncoderFL.getDistance()/1.153 - OFFSETSTEERENCODERFL) % 360.0;
		angleFR = (RobotMap.drivetrainSteerEncoderFR.getDistance()/1.153 - OFFSETSTEERENCODERFR) % 360.0;
		angleBR = (RobotMap.drivetrainSteerEncoderBR.getDistance()/1.153 - OFFSETSTEERENCODERBR) % 360.0;
		angleBL = (RobotMap.drivetrainSteerEncoderBL.getDistance()/1.153 - OFFSETSTEERENCODERBL) % 360.0;
    	
    	double distanceFL = 45 - angleFL;
		distanceFL = (distanceFL + 180) % 360 - 180;
		steerSpeedFL = 1*-STEERSPEEDCOEFFICIENT*distanceFL;
		
		double distanceFR = 135 - angleFR;
		distanceFR = (distanceFR + 180) % 360 - 180;
		steerSpeedFR = 1*-STEERSPEEDCOEFFICIENT*distanceFR;
		
		double distanceBL = 315 - angleBL;
		distanceBL = (distanceBL + 180) % 360 - 180;
		steerSpeedBL = 1*-STEERSPEEDCOEFFICIENT*distanceBL;
		
		double distanceBR = 225 - angleBR;
		distanceBR = (distanceBR + 180) % 360 - 180;
		steerSpeedBR = 1*-STEERSPEEDCOEFFICIENT*distanceBR;
		
		if(Math.abs(steerSpeedFL) < 0.01){
			steerSpeedFL = 0;
		}else if(Math.abs(steerSpeedFL) < 0.1){
			steerSpeedFL = steerSpeedFL*0.15/(Math.abs(steerSpeedFL));
		}else{
			steerSpeedFL = steerSpeedFL*1.0/(Math.abs(steerSpeedFL));
		}
		
		if(Math.abs(steerSpeedFR) < 0.01){
			steerSpeedFR = 0;
		}else if(Math.abs(steerSpeedFR) < 0.1){
			steerSpeedFR = steerSpeedFR*0.15/(Math.abs(steerSpeedFR));
		}else{
			steerSpeedFR = steerSpeedFR*1.0/(Math.abs(steerSpeedFR));
		}
		
		if(Math.abs(steerSpeedBR) < 0.01){
			steerSpeedBR = 0;
		}else if(Math.abs(steerSpeedBR) < 0.1){
			steerSpeedBR = steerSpeedBR*0.15/(Math.abs(steerSpeedBR));
		}else{
			steerSpeedBR = steerSpeedBR*1.0/(Math.abs(steerSpeedBR));
		}
		
		if(Math.abs(steerSpeedBL) < 0.01){
			steerSpeedBL = 0;
		}else if(Math.abs(steerSpeedBL) < 0.1){
			steerSpeedBL = steerSpeedBL*0.15/(Math.abs(steerSpeedBL));
		}else{
			steerSpeedBL = steerSpeedBL*1.0/(Math.abs(steerSpeedBL));
		}
		
		RobotMap.drivetrainSteerMotorFL.set(steerSpeedFL > 1 ? 1
				: steerSpeedFL < -1 ? -1 : steerSpeedFL);
		RobotMap.drivetrainSteerMotorFR.set(steerSpeedFR > 1 ? 1
				: steerSpeedFR < -1 ? -1 : steerSpeedFR);
		RobotMap.drivetrainSteerMotorBR.set(steerSpeedBR > 1 ? 1
				: steerSpeedBR < -1 ? -1 : steerSpeedBR);
		RobotMap.drivetrainSteerMotorBL.set(steerSpeedBL > 1 ? 1
				: steerSpeedBL < -1 ? -1 : steerSpeedBL);
		if(Math.abs(steerSpeedFL) + Math.abs(steerSpeedFR) + Math.abs(steerSpeedBR) + Math.abs(steerSpeedBL) == 0){
			finished = true;
		}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return finished;
    }

    // Called once after isFinished returns true
    protected void end() {
    	RobotMap.drivetrainSteerMotorFL.set(0);
		RobotMap.drivetrainSteerMotorFR.set(0);
		RobotMap.drivetrainSteerMotorBR.set(0);
		RobotMap.drivetrainSteerMotorBL.set(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
