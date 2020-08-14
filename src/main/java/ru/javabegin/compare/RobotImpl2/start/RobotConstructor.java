package ru.javabegin.compare.RobotImpl2.start;

import ru.javabegin.compare.RobotImpl2.impls.sony.SonyHand;
import ru.javabegin.compare.RobotImpl2.impls.sony.SonyHead;
import ru.javabegin.compare.RobotImpl2.impls.toshiba.ToshibaLeg;

public class RobotConstructor {

	public static void main(String[] args){

		SonyHand sonyHand = new SonyHand();
		ToshibaLeg toshibaLeg = new ToshibaLeg();
		SonyHead sonyHead = new SonyHead();

		Robot robot = new Robot(sonyHand, toshibaLeg, sonyHead);

		robot.action();
	}

}
