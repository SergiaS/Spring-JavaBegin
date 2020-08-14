package ru.javabegin.compare.RobotImpl2.start;

import ru.javabegin.compare.RobotImpl2.interfaces.Hand;
import ru.javabegin.compare.RobotImpl2.interfaces.Head;
import ru.javabegin.compare.RobotImpl2.interfaces.Leg;

public class Robot {

	private Hand hand;
	private Leg leg;
	private Head head;

	public Robot(Hand hand, Leg leg, Head head) {
		super();
		this.hand = hand;
		this.leg = leg;
		this.head = head;
	}

	public void action(){
		head.calc();
		hand.catchSomething();
		leg.go();
	}

}
