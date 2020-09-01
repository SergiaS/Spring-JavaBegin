package ru.javabegin.training.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.javabegin.training.spring.dao.impls.SQLiteDAO;
import ru.javabegin.training.spring.dao.objects.MP3;

import java.util.ArrayList;
import java.util.List;

public class Start {

	public static void main(String[] args) {
		MP3 firstMP3 = new MP3();
		firstMP3.setId(28);
		firstMP3.setName("Bla name");
		firstMP3.setAuthor("Bla author");

		MP3 secondMP3 = new MP3();
		secondMP3.setId(29);
		secondMP3.setName("Bla name2");
		secondMP3.setAuthor("Bla author2");

		List<MP3> list = new ArrayList<>();
		list.add(firstMP3);
		list.add(secondMP3);

		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		SQLiteDAO sqLiteDAO = (SQLiteDAO) context.getBean("sqliteDAO");

		System.out.println(sqLiteDAO.batchUpdate(list));

		((ConfigurableApplicationContext)context).close();// закрытие контекста вручную

	}
}
