package ru.javabegin.RobotSpring.impls.toshiba;

import org.springframework.stereotype.Component;
import ru.javabegin.RobotSpring.interfaces.Hand;

@Component
public class ToshibaHand implements Hand {

	public void catchSomething() {
		System.out.println("Catched from Toshiba!");
	}

}
