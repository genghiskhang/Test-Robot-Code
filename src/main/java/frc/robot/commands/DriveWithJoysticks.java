package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.Constants;
import frc.robot.subsystems.DriveTrain;

public class DriveWithJoysticks extends CommandBase {
  private final DriveTrain driveTrain;

  public DriveWithJoysticks(DriveTrain dt) {
    driveTrain = dt;
    addRequirements(driveTrain);
  }

  public void initialize() {
  }

  public void execute() {
    driveTrain.driveWithJoysticks(RobotContainer.driverJoystick, Constants.DRIVETRAINSPEED);
  }

  public void end(boolean interrupted) {
  }

  public boolean isFinished() {
    return false;
  }
}
