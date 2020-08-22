package ru.javabegin.RobotSpring.impls.toshiba;

import org.springframework.stereotype.Component;
import ru.javabegin.RobotSpring.interfaces.Head;

@Component
public class ToshibaHead implements Head {

	public void calc() {
		System.out.println("Thinking about Toshiba...");
	}

}
