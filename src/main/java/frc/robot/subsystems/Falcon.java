// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Falcon extends SubsystemBase {

  private WPI_TalonFX fx;

  /** Creates a new Falcon. */
  public Falcon() {
    fx = new WPI_TalonFX(Constants.falcon_id);
    fx.configFactoryDefault();
    fx.configSelectedFeedbackSensor(FeedbackDevice.IntegratedSensor);
    fx.setNeutralMode(NeutralMode.Coast);
  }

  // @Override
  // public void periodic() {}

  public void move(double speed) {
    fx.set(speed);
  }

  public void stop() {
    fx.stopMotor();
  }

  public double getPosition() {
    return fx.getSelectedSensorPosition();
  }

  public double getVelocity() {
    return fx.getSelectedSensorVelocity();
  }
}
