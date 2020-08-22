package ru.javabegin.RobotSpring.impls.toshiba;

import org.springframework.stereotype.Component;
import ru.javabegin.RobotSpring.interfaces.Leg;

@Component
public class ToshibaLeg implements Leg {

	public void go() {
		System.out.println("Go to Toshiba!");
	}

}
