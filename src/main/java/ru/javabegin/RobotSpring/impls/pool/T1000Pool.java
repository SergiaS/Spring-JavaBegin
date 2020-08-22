package ru.javabegin.RobotSpring.impls.pool;

import org.springframework.beans.factory.annotation.Autowired;
import ru.javabegin.RobotSpring.enums.ColorStyle;
import ru.javabegin.RobotSpring.interfaces.Robot;
import ru.javabegin.RobotSpring.qualifiers.RobotQualifier;

public class T1000Pool {

	@Autowired
	@RobotQualifier(sound = false, color = ColorStyle.BLACK)
	private Robot blackRobot;

	@Autowired
	@RobotQualifier(sound = true, color = ColorStyle.BLACK)
	private Robot blackSoundableRobot;

	public T1000Pool() {
		System.out.println("t1000 pool constructor()");
	}

	public Robot getBlackRobot() {
		return blackRobot;
	}

	public Robot getBlackSoundableRobot() {
		return blackSoundableRobot;
	}
}
