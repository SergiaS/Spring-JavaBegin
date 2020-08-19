package ru.javabegin.RobotSpring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ru.javabegin.RobotSpring.impls.pool.T1000Pool;

public class Start {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("all_context.xml");

		T1000Pool t1000GoldenPool = (T1000Pool) context.getBean("t1000GoldenPool");
		t1000GoldenPool.beginShow();

		((ConfigurableApplicationContext)context).close();// закрытие контекста вручную


	}
}
