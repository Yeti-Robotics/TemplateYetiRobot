// Copyright (c) FIRST and other WPILib contributors.

// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.*;
import frc.robot.subsystems.TemplateDrivetrainSubsystem;


public final class Autos
{

    public static CommandBase driveForwardAuto() {
        return Commands.sequence(
            new RunCommand(() -> TemplateDrivetrainSubsystem.getInstance().tankDrive(0.5, 0.5), TemplateDrivetrainSubsystem.getInstance()),
            new WaitCommand(2),
            new InstantCommand(() -> TemplateDrivetrainSubsystem.getInstance().stop(), TemplateDrivetrainSubsystem.getInstance())
        );
    }

    private Autos()
    {
        throw new UnsupportedOperationException("This is a utility class!");
    }
}
