// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc1701.RobotBuild2015;
    

import com.kauailabs.nav6.frc.IMUAdvanced;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.PIDSource.PIDSourceParameter;
import edu.wpi.first.wpilibj.SerialPort;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    public static CANTalon drivetrainDriveMotorFL;
    public static CANTalon drivetrainDriveMotorFR;
    public static CANTalon drivetrainDriveMotorBR;
    public static CANTalon drivetrainDriveMotorBL;
    public static CANTalon drivetrainSteerMotorFL;
    public static CANTalon drivetrainSteerMotorFR;
    public static CANTalon drivetrainSteerMotorBR;
    public static CANTalon drivetrainSteerMotorBL;
    public static CANTalon elevatorElevatorMotorL;
    public static CANTalon elevatorElevatorMotorR;
    public static CANTalon elevatorExtendMotorL;
    public static CANTalon elevatorExtendMotorR;
    public static CANTalon doorsDoorMotorL;
    public static CANTalon doorsDoorMotorR;
    public static IMUAdvanced imu;
    public static SerialPort serial_port;
    public static PIDController FL;
    public static PIDController FR;
    public static PIDController BR;
    public static PIDController BL;
    public static int yawOffset = 0;
    public static boolean last = false;
    public static boolean initialzed = false;
	public static double speedCoefficient = 0.4;
	public static int elevatorHeight = 0;
	public static boolean fieldoriented = true;
//    public static I2C navx;
    //IMU imu;  // Alternatively, use IMUAdvanced for advanced features
    public static boolean first_iteration;
    public static boolean TeleopRunning = false;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static Encoder drivetrainSteerEncoderFL;
    public static Encoder drivetrainSteerEncoderBL;
    public static Encoder drivetrainSteerEncoderFR;
    public static Encoder drivetrainSteerEncoderBR;
    public static DigitalInput drivetrainFrontLeftBumperLimitSwitch;
    public static DigitalInput drivetrainFrontRightBumperLimitSwitch;
    public static DigitalInput elevatorBottomLimitSwitch;
    public static DigitalInput elevatorOneToteLimitSwitch;
    public static DigitalInput elevatorStepLimitSwitch;
    public static DigitalInput elevatorTopLimitSwitch;
    public static DigitalInput elevatorLeftSlideLimitSwitchRetracted;
    public static DigitalInput elevatorRightSlideLimitSwitchRetracted;
    public static DigitalInput elevatorRightSlideLimitSwitchTote;
    public static DigitalInput elevatorRightSlideLimitSwitchExtended;
    public static DigitalInput elevatorIRToteIn;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
    	try {

            System.out.println("Instanciating Serial Port");
    	    serial_port = new SerialPort(9600,SerialPort.Port.kUSB);
//    	    navx = new I2C(I2C.Port.kOnboard, 50);
    	            
    	            // You can add a second parameter to modify the 
    	            // update rate (in hz) from 4 to 100.  The default is 100.
    	            // If you need to minimize CPU load, you can set it to a
    	            // lower value, as shown here, depending upon your needs.
    	            
    	            // You can also use the IMUAdvanced class for advanced
    	            // features.
    	            
    	            byte update_rate_hz = 100;
    	            //imu = new IMU(serial_port,update_rate_hz);
//    	            System.out.println("Instanciating IMU");
    	            RobotMap.imu = new IMUAdvanced(serial_port, update_rate_hz);
    	    } catch( Exception ex ) {
    	         System.out.println(ex);  
    	    }
    	    if ( RobotMap.imu != null ) {
//    	    	RobotMap.navx.write(0x16, 0);
//    	    	RobotMap.navx.write(0x17, 0);
//    	    	RobotMap.navx.write(0x04, 100);
//    	    	RobotMap.navx.write(0x05, 2);
//    	    	RobotMap.navx.write(0x06, 2000);
    	        System.out.println("IMU is running");
    	    }else
    	    	System.out.println("IMU is not running");
    	    first_iteration = true;
    	    
//	    FL = new PIDController(0, 0, 0, drivetrainSteerEncoderFL, drivetrainSteerMotorFL);
//	    FR = new PIDController(0, 0, 0, drivetrainSteerEncoderFR, drivetrainSteerMotorFR);
//	    BR = new PIDController(0, 0, 0, drivetrainSteerEncoderBR, drivetrainSteerMotorBR);
//	    BL = new PIDController(0, 0, 0, drivetrainSteerEncoderBL, drivetrainSteerMotorBL);
    	drivetrainDriveMotorFL = new CANTalon(1);
    	drivetrainDriveMotorFL.setVoltageRampRate(12);
    	
        drivetrainDriveMotorFR = new CANTalon(3);
    	drivetrainDriveMotorFR.setVoltageRampRate(12);
        
        drivetrainDriveMotorBR = new CANTalon(4);
    	drivetrainDriveMotorBR.setVoltageRampRate(12);
        
        drivetrainDriveMotorBL = new CANTalon(2);
    	drivetrainDriveMotorBL.setVoltageRampRate(12);
        
        drivetrainSteerMotorFL = new CANTalon(5);
        
        drivetrainSteerMotorFR = new CANTalon(7);
        
        drivetrainSteerMotorBR = new CANTalon(8);
        
        drivetrainSteerMotorBL = new CANTalon(6);
        
        elevatorElevatorMotorL = new CANTalon(9);
        
        elevatorElevatorMotorR = new CANTalon(10);
        
        elevatorExtendMotorL = new CANTalon(11);
        
        elevatorExtendMotorR = new CANTalon(12);
        
        doorsDoorMotorL = new CANTalon(13);
        
        doorsDoorMotorR = new CANTalon(14);
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        drivetrainSteerEncoderFL = new Encoder(0, 1, false, EncodingType.k4X);
        LiveWindow.addSensor("Drivetrain", "Steer Encoder FL", drivetrainSteerEncoderFL);
        drivetrainSteerEncoderFL.setDistancePerPulse(1.0);
        drivetrainSteerEncoderFL.setPIDSourceParameter(PIDSourceParameter.kRate);
        drivetrainSteerEncoderBL = new Encoder(2, 3, false, EncodingType.k4X);
        LiveWindow.addSensor("Drivetrain", "Steer Encoder BL", drivetrainSteerEncoderBL);
        drivetrainSteerEncoderBL.setDistancePerPulse(1.0);
        drivetrainSteerEncoderBL.setPIDSourceParameter(PIDSourceParameter.kRate);
        drivetrainSteerEncoderFR = new Encoder(4, 5, false, EncodingType.k4X);
        LiveWindow.addSensor("Drivetrain", "Steer Encoder FR", drivetrainSteerEncoderFR);
        drivetrainSteerEncoderFR.setDistancePerPulse(1.0);
        drivetrainSteerEncoderFR.setPIDSourceParameter(PIDSourceParameter.kRate);
        drivetrainSteerEncoderBR = new Encoder(6, 7, false, EncodingType.k4X);
        LiveWindow.addSensor("Drivetrain", "Steer Encoder BR", drivetrainSteerEncoderBR);
        drivetrainSteerEncoderBR.setDistancePerPulse(1.0);
        drivetrainSteerEncoderBR.setPIDSourceParameter(PIDSourceParameter.kRate);
        drivetrainFrontLeftBumperLimitSwitch = new DigitalInput(22);
        LiveWindow.addSensor("Drivetrain", "Front Left Bumper Limit Switch", drivetrainFrontLeftBumperLimitSwitch);
        
        drivetrainFrontRightBumperLimitSwitch = new DigitalInput(21);
        LiveWindow.addSensor("Drivetrain", "Front Right Bumper Limit Switch", drivetrainFrontRightBumperLimitSwitch);
        
        elevatorBottomLimitSwitch = new DigitalInput(8);
        LiveWindow.addSensor("Elevator", "Bottom Limit Switch", elevatorBottomLimitSwitch);
        
        elevatorOneToteLimitSwitch = new DigitalInput(10);
        LiveWindow.addSensor("Elevator", "One Tote Limit Switch", elevatorOneToteLimitSwitch);
        
        elevatorStepLimitSwitch = new DigitalInput(11);
        LiveWindow.addSensor("Elevator", "Step Limit Switch", elevatorStepLimitSwitch);
        
        elevatorTopLimitSwitch = new DigitalInput(9);
        LiveWindow.addSensor("Elevator", "Top Limit Switch", elevatorTopLimitSwitch);
        
        elevatorLeftSlideLimitSwitchRetracted = new DigitalInput(12);
        LiveWindow.addSensor("Elevator", "Left Slide Limit Switch Retracted", elevatorLeftSlideLimitSwitchRetracted);
        
        elevatorRightSlideLimitSwitchRetracted = new DigitalInput(13);
        LiveWindow.addSensor("Elevator", "Right Slide Limit Switch Retracted", elevatorRightSlideLimitSwitchRetracted);
        
        elevatorRightSlideLimitSwitchTote = new DigitalInput(18);
        LiveWindow.addSensor("Elevator", "Right Slide Limit Switch Tote", elevatorRightSlideLimitSwitchTote);
        
        elevatorRightSlideLimitSwitchExtended = new DigitalInput(19);
        LiveWindow.addSensor("Elevator", "Right Slide Limit Switch Extended", elevatorRightSlideLimitSwitchExtended);
        
        elevatorIRToteIn = new DigitalInput(20);
        LiveWindow.addSensor("Elevator", "IR Tote In", elevatorIRToteIn);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
