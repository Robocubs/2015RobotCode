// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package org.usfirst.frc1701.RobotBuild2015.subsystems;

import org.usfirst.frc1701.RobotBuild2015.RobotMap;
import org.usfirst.frc1701.RobotBuild2015.commands.TeleopDrive;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {
	CANTalon driveMotorFL = RobotMap.drivetrainDriveMotorFL;
	CANTalon driveMotorFR = RobotMap.drivetrainDriveMotorFR;
	CANTalon driveMotorBR = RobotMap.drivetrainDriveMotorBR;
	CANTalon driveMotorBL = RobotMap.drivetrainDriveMotorBL;
	CANTalon steerMotorFL = RobotMap.drivetrainSteerMotorFL;
	CANTalon steerMotorFR = RobotMap.drivetrainSteerMotorFR;
	CANTalon steerMotorBR = RobotMap.drivetrainSteerMotorBR;
	CANTalon steerMotorBL = RobotMap.drivetrainSteerMotorBL;
	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    Encoder steerEncoderFL = RobotMap.drivetrainSteerEncoderFL;
    Encoder steerEncoderBL = RobotMap.drivetrainSteerEncoderBL;
    Encoder steerEncoderFR = RobotMap.drivetrainSteerEncoderFR;
    Encoder steerEncoderBR = RobotMap.drivetrainSteerEncoderBR;
    DigitalInput frontLeftBumperLimitSwitch = RobotMap.drivetrainFrontLeftBumperLimitSwitch;
    DigitalInput frontRightBumperLimitSwitch = RobotMap.drivetrainFrontRightBumperLimitSwitch;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	public void initDefaultCommand() {
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        setDefaultCommand(new TeleopDrive());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
}
