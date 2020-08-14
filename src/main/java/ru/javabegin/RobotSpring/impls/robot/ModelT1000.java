package ru.javabegin.RobotSpring.impls.robot;

import ru.javabegin.RobotSpring.interfaces.Hand;
import ru.javabegin.RobotSpring.interfaces.Head;
import ru.javabegin.RobotSpring.interfaces.Leg;
import ru.javabegin.RobotSpring.interfaces.Robot;

public class ModelT1000 implements Robot {

	private Hand hand;
	private Leg leg;
	private Head head;

	public ModelT1000() {
	}

	public ModelT1000(Hand hand, Leg leg, Head head) {
		super();
		this.hand = hand;
		this.leg = leg;
		this.head = head;
	}

	@Override
	public void action() {
		head.calc();
		hand.catchSomething();
		leg.go();
	}

	@Override
	public void dance() {
		System.out.println("T1000 is dancing!");
	}

}
