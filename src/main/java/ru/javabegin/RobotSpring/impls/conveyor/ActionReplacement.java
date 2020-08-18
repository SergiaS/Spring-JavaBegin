package ru.javabegin.RobotSpring.impls.conveyor;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class ActionReplacement implements MethodReplacer {

	@Override
	public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
		System.out.println("BOOM");
		return o;
	}
}
