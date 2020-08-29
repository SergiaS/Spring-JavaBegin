package ru.javabegin.training.spring.dao.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import ru.javabegin.training.spring.dao.interfaces.MP3Dao;
import ru.javabegin.training.spring.dao.objects.MP3;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@Component("sqliteDAO")
public class SQLiteDAO implements MP3Dao {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void insert(MP3 mp3) {
		String sql = "insert into mp3 (name, author) VALUES (?, ?)";
		jdbcTemplate.update(sql, new Object[]{mp3.getName(), mp3.getAuthor()});
	}

	public void insertWithJDBC(MP3 mp3) {
		Connection conn = null;

		try {
			Class.forName("org.sqlite.JDBC");
			String url = "jdbc:sqlite:src/main/resources/db/SpringDB.db";
			conn = DriverManager.getConnection(url, "", "");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		String sql = "insert into mp3 (name, author) VALUES (?, ?)";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, mp3.getName());
			ps.setString(2, mp3.getAuthor());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public void delete(MP3 mp3) {

	}

	@Override
	public MP3 getMP3ByID(int id) {
		return null;
	}

	@Override
	public List<MP3> getMP3ListByName(String name) {
		return null;
	}

	@Override
	public List<MP3> getMP3ListByAuthor(String author) {
		return null;
	}
}
