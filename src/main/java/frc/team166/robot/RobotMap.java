/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.team166.robot;

import edu.wpi.first.wpilibj.XboxController;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	public static class CAN {
		public final static int FrontRight = 1;
		public final static int FrontLeft = 3;
		public final static int BackLeft = 2;
		public final static int BackRight = 4;

	}

	public static class Controller {
		public final static int DriveJoyStickPortLeft = 0;
		public final static int DriveJoyStickPortRight = 1;
		public final static int XboxController = 2;
	}

	public static class analogInputs {
		public final static int myGyroPort = 1;
	}

	public static class joystickButtons {

		public static int driveStraightTrigger = 1;
		public static int kTop = 2;

	}

	public static class xboxButtons {
		public static int xboxAbutton = 1;
		public static int xboxXbutton = 2;

	}

	public static class Encoders {
		public final static int LeftA = 0;
		public final static int RightA = 2;
		public final static int LeftB = 1;
		public final static int RightB = 3;

	}
}
