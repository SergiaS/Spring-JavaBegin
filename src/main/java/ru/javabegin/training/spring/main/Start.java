package ru.javabegin.training.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.javabegin.training.spring.dao.impls.SQLiteDAO;
import ru.javabegin.training.spring.dao.objects.MP3;

import java.util.Arrays;
import java.util.List;

public class Start {

	public static void main(String[] args) {
//		MP3 mp3 = new MP3();
//		mp3.setName("Song name");
//		mp3.setAuthor("Song author");

		// new SQLiteDAO().insertWithJDBC(mp3);

		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		SQLiteDAO sqLiteDAO = (SQLiteDAO) context.getBean("sqliteDAO");
//		sqLiteDAO.insert(mp3);


		MP3 mp3_1 = new MP3();
		mp3_1.setName("Evanescence");
		mp3_1.setAuthor("Haunter");
		MP3 mp3_2 = new MP3();
		mp3_2.setName("Bob Marley");
		mp3_2.setAuthor("Hippy");

		List<MP3> mp3List = Arrays.asList(mp3_1, mp3_2);
		sqLiteDAO.insert(mp3List);
//		sqLiteDAO.delete(23);
	}
}
