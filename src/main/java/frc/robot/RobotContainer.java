package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.commands.DriveWithJoysticks;
import frc.robot.subsystems.DriveTrain;

public class RobotContainer {
    private final DriveTrain driveTrain;
    private final DriveWithJoysticks driveWithJoysticks;
    private final DriveForwardTimed driveForwardTimed;
    private static XboxController driverJoystick;

    public RobotContainer() {
        confgiureButtonBindings();
    }

}