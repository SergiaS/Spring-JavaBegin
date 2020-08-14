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
		hand.catchSomething();
		head.calc();
		leg.go();
	}

	@Override
	public void dance() {
		System.out.println("T1000 is dancing!");
	}

	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}

	public Leg getLeg() {
		return leg;
	}

	public void setLeg(Leg leg) {
		this.leg = leg;
	}

	public Head getHead() {
		return head;
	}

	public void setHead(Head head) {
		this.head = head;
	}
}
