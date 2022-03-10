// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  /*
  private static final String kDefaultAuto = "Default";
  private static final String kCustomAuto = "My Auto";
  private String m_autoSelected;
  private final SendableChooser<String> m_chooser = new SendableChooser<>();

  TalonSRX backRightMotor = new TalonSRX(10);
  TalonSRX backLeftMotor = new TalonSRX(8);
  TalonSRX frontRightMotor = new TalonSRX(6);
  TalonSRX frontLeftMotor = new TalonSRX(1);
  TalonSRX liftMotor = new TalonSRX(5);
  TalonSRX wristMotor = new TalonSRX(3);
  TalonSRX wheelOfDeathjpg = new TalonSRX(2);
  TalonSRX wheelOfDeath2jpg = new TalonSRX(7);

  Joystick jStick = new Joystick(1);
  Joystick bStick = new Joystick(2);

  double speedAddition = .75;*/

  /**
   * This function is run when the robot is first started up and should be used
   * for any initialization code.
   */
  @Override
  public void robotInit() {/*
    m_chooser.setDefaultOption("Default Auto", kDefaultAuto);
    m_chooser.addOption("My Auto", kCustomAuto);
    SmartDashboard.putData("Auto choices", m_chooser);*/
  }

  /**
   * This function is called every robot packet, no matter the mode. Use this for
   * items like diagnostics that you want ran during disabled, autonomous,
   * teleoperated and test.
   *
   * <p>
   * This runs after the mode specific periodic functions, but before LiveWindow
   * and SmartDashboard integrated updating.
   */
  @Override
  public void robotPeriodic() {
  }

  /**
   * This autonomous (along with the chooser code above) shows how to select
   * between different autonomous modes using the dashboard. The sendable chooser
   * code works with the Java SmartDashboard. If you prefer the LabVIEW Dashboard,
   * remove all of the chooser code and uncomment the getString line to get the
   * auto name from the text box below the Gyro
   *
   * <p>
   * You can add additional auto modes by adding additional comparisons to the
   * switch structure below with additional strings. If using the SendableChooser
   * make sure to add them to the chooser code above as well.
   */
  @Override
  public void autonomousInit() {/*
    m_autoSelected = m_chooser.getSelected();
    // m_autoSelected = SmartDashboard.getString("Auto Selector", kDefaultAuto);
    System.out.println("Auto selected: " + m_autoSelected);*/
  }

  /** This function is called periodically during autonomous. */
  @Override
  public void autonomousPeriodic() {/*
    switch (m_autoSelected) {
      case kCustomAuto:
        // Put custom auto code here
        break;
      case kDefaultAuto:
      default:
        // Put default auto code here
        break;
    }*/
  }

  /** This function is called once when teleop is enabled. */
  @Override
  public void teleopInit() {
  }

  /** This function is called periodically during operator control. */
  @Override
  public void teleopPeriodic() {/*
    backRightMotor.set(ControlMode.PercentOutput,
        (((jStick.getRawAxis(4) / 3) * -1.0) + ((jStick.getRawAxis(1) / 3) * -1.0) + ((jStick.getRawAxis(0) / 3) * 1.0))
            * speedAddition);
    backLeftMotor.set(ControlMode.PercentOutput,
        (((jStick.getRawAxis(4) / 3) * 1.0) + ((jStick.getRawAxis(1) / 3) * -1.0) + ((jStick.getRawAxis(0) / 3) * -1.0))
            * speedAddition);
    frontRightMotor.set(ControlMode.PercentOutput,
        (((jStick.getRawAxis(4) / 3) * 1.0) + ((jStick.getRawAxis(1) / 3) * 1.0) + ((jStick.getRawAxis(0) / 3) * 1.0))
            * speedAddition);
    frontLeftMotor.set(ControlMode.PercentOutput,
        (((jStick.getRawAxis(4) / 3) * 1.0) + ((jStick.getRawAxis(1) / 3) * -1.0) + ((jStick.getRawAxis(0) / 3) * 1.0))
            * speedAddition);
    if (jStick.getRawButton(11)) {
      liftMotor.set(ControlMode.PercentOutput, -1);
    } else if (jStick.getRawButton(13)) {
      liftMotor.set(ControlMode.PercentOutput, 1);
    } else {
      liftMotor.set(ControlMode.PercentOutput, 0);
    }
    if (jStick.getRawButton(7)) {
      wristMotor.set(ControlMode.PercentOutput, 1);
    } else if (jStick.getRawButton(9)) {
      wristMotor.set(ControlMode.PercentOutput, -1);
    } else {
      wristMotor.set(ControlMode.PercentOutput, 0);
    }

    if (jStick.getRawButton(1)) {
      wheelOfDeathjpg.set(ControlMode.PercentOutput, 0.70);
      wheelOfDeath2jpg.set(ControlMode.PercentOutput, -0.70);
    } else if (jStick.getRawButton(6)) {
      wheelOfDeathjpg.set(ControlMode.PercentOutput, -0.70);
      wheelOfDeath2jpg.set(ControlMode.PercentOutput, 0.70);
    } else {
      wheelOfDeathjpg.set(ControlMode.PercentOutput, 0);
      wheelOfDeath2jpg.set(ControlMode.PercentOutput, 0);
    }
*/
  }

  /** This function is called once when the robot is disabled. */
  @Override
  public void disabledInit() {
  }

  /** This function is called periodically when disabled. */
  @Override
  public void disabledPeriodic() {
  }

  /** This function is called once when test mode is enabled. */
  @Override
  public void testInit() {
  }

  /** This function is called periodically during test mode. */
  @Override
  public void testPeriodic() {
  }
}
