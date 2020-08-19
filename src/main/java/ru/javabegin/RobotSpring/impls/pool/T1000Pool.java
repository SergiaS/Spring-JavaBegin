package ru.javabegin.RobotSpring.impls.pool;

import ru.javabegin.RobotSpring.interfaces.Robot;
import ru.javabegin.RobotSpring.interfaces.RobotPool;

import java.util.Collection;
import java.util.Map;

public class T1000Pool implements RobotPool {

	private Collection<Robot> robotCollection;
	private Map<Integer, Robot> robotMap;

	public Map<Integer, Robot> getRobotMap() {
		return robotMap;
	}

	public void setRobotMap(Map<Integer, Robot> robotMap) {
		this.robotMap = robotMap;
	}

	public void setRobotCollection(Collection<Robot> robotCollection) {
		this.robotCollection = robotCollection;
	}

	@Override
	public Collection<Robot> getRobotCollection() {
		return robotCollection;
	}

	public void action() {
		for (Robot robot : robotCollection) {
			robot.action();
		}
	}

	public void actionMap() {
		for (Map.Entry<Integer, Robot> entry : robotMap.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}
}
