package ru.javabegin.compare.RobotImpl1.start;

import ru.javabegin.compare.RobotImpl1.objects.SonyHand;
import ru.javabegin.compare.RobotImpl1.objects.SonyHead;
import ru.javabegin.compare.RobotImpl1.objects.SonyLeg;

public class Robot {

	private SonyHand hand = new SonyHand();
	private SonyLeg leg = new SonyLeg();
	private SonyHead head = new SonyHead();

	public void action(){
		head.calc();
		hand.catchSomething();
		leg.go();
	}

}
